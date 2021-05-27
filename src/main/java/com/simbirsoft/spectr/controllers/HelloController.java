package com.simbirsoft.spectr.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/greet")
    public String greet() {
        return "greet";
    }
}
