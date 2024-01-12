package com.parmar.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class ProjectController {


    @GetMapping("/message")
    public String message() {
        return "welcome to spring boot world !!";
    }
}
