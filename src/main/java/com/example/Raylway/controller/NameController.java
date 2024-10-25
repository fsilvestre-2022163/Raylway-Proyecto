package com.example.Raylway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class NameController {

    @GetMapping("/name")
    public String getName() {
        return "Fréderic Silvestre"; // Reemplaza con tu nombre real
    }
}
