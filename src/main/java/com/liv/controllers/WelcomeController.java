package com.liv.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class WelcomeController {

    @GetMapping("/")
    public String getHomePage(){
        return "welcome/login";
    }

    @GetMapping("/welcome")
    public String getWelcomePage(){

        return "welcome/welcome";
    }
}
