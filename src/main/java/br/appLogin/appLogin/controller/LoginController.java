package br.appLogin.appLogin.controller;

import br.appLogin.appLogin.model.User;
import br.appLogin.appLogin.repository.LoginRepository;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

    @Autowired
    private LoginRepository lr;

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @PostMapping("/logar")
    public String loginuser(User user, Model model, HttpServletResponse response){

     User userlogged = this.lr.findByEmailAndPassword(user.getEmail(), user.getPassword());

        if (userlogged != null){
            return "redirect:/dashboard";
        }

        model.addAttribute("erro", "Invalid User!");
        return "login";
     }

    @GetMapping("/creat")
    public String creat(){
        return "creat";
    }

    @GetMapping("/dashboard")
    public String dashboard(){
        return "dashboard";
    }
    @PostMapping("/registerUser")
    public String registerUser(@Valid User user, BindingResult result){


        System.out.println("ENTROU AQUI");

        if(result.hasErrors()){
            return "redirect:/creat";
        }
        lr.save(user);
        
        return "redirect:/login";
    }

}
