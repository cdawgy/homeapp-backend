package com.rathdrum.homeappbackend.controllers;

import com.rathdrum.homeappbackend.dtos.LoginModel;
import com.rathdrum.homeappbackend.services.LoginService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class MainController {

    private LoginService loginService;

    public MainController(LoginService loginService){
        this.loginService = loginService;
    }

    @GetMapping("/hello")
    public String hello(){
        return "HelloWorld!";
    }

    @PostMapping("/login")
    public boolean userLoginAttempt(@RequestBody LoginModel loginModel){
        return loginService.validateUserCredentials(loginModel);
    }
}
