package com.example.springsecuritythymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LandingPageFunctionController {

    @GetMapping("/landingPageFunction")
    public String landingPageFunction(Model model) {

        return "loginFunctionFragment";
    }
}
