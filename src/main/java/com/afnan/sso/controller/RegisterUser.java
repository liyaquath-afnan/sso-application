package com.afnan.sso.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterUser {

    @GetMapping("/mapping")
    public String storeUserInfo() {
        return "Register User";
    }
}
