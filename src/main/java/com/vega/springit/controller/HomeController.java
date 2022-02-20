package com.vega.springit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

//@Controller
//@ResponseBody
//@RestController // instead of @Controller & @ResponseBody
@Controller
public class HomeController {
    @GetMapping("/hello")
    public String handle(Model model, HttpServletRequest request) {
        model.addAttribute("message", "Hello World!");
        return "index";
    }
}
