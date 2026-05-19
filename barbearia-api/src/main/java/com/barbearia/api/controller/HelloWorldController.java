package com.barbearia.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String dizerOla() {
        return "Olá, Mundo! A nossa barbearia está aberta!";
    }
}
