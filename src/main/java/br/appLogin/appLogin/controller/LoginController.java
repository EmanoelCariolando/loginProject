package br.appLogin.appLogin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

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
}
