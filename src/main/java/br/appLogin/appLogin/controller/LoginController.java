package br.appLogin.appLogin.controller;

import br.appLogin.appLogin.model.User;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login(){
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
    @RequestMapping(value = "/registerUser", method = RequestMethod.POST)
    public String registerUser(@Valid User user, BindingResult result){
        if(result.hasErrors()){
            return "redirect:/creat";
        }
        return "";
    }

}
