package com.rathdrum.homeappbackend.services;

import com.rathdrum.homeappbackend.dtos.LoginModel;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class LoginService {
    private String dbUsername = "someUser";
    private String dbPassword = "somePass";

    public boolean validateUserCredentials(LoginModel loginModel) {
        if (loginModel.getUsername().equals(this.dbUsername) && loginModel.getPassword().equals(this.dbPassword)) {
            return true;
        }
        return false;
    }
}
