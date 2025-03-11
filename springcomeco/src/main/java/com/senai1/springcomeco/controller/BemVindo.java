package com.senai1.springcomeco.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/BienVenido")
public class BemVindo {

    @RequestMapping
    public String bemVindo() {
        return "Bem-vindo ao Spring Boot! - Senai";
    }
}
