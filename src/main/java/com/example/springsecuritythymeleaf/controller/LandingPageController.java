package com.example.springsecuritythymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LandingPageController {

    @GetMapping("/landing")
    public String landingPage() {
        return "landing";
    }
}
