package com.example.libraryApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class LibraryController {

    @GetMapping("/")
    public String Homepage(){
        return "Welcome to Library";
    }
    @PostMapping("/login")
    public String Loginpage(){
        return "Welcome to login page";
    }
    @PostMapping("/registration")
    public String UserReg(){
        return "Welcome to user registration";
    }
}
