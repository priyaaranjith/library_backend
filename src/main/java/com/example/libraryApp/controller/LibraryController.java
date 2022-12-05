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
    @PostMapping("/entry")
    public String BookEntry(){
        return "Welcome to book entry";
    }
    @GetMapping("/view")
    public String ViewBooks(){
        return "Welcome to view books";
    }
    @PostMapping("/search")
    public String SearchBook(){
        return "Welcome to search books";
    }
    @PostMapping("/edit")
    public String EditBook(){
        return "Welcome to book edit";
    }
    @PostMapping("/delete")
    public String DeleteBook(){
        return "Welcome to delete books";
    }
}
