package com.vega.springit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//@Controller
//@ResponseBody
//@RestController // instead of @Controller & @ResponseBody
@Controller
public class HomeController {
    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("title","Hello, Thymeleaf!");
        return "home";
    }
}