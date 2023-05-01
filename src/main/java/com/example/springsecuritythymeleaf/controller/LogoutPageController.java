package com.example.springsecuritythymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LogoutPageController {

    @GetMapping("/logoutPage")
    public String logoutPage() {
        return "logout";
    }
}
