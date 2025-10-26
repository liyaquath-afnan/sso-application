package com.afnan.sso.controllers;

import com.afnan.sso.dto.UserDTO;
import com.afnan.sso.services.RegisterationServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/users")
public class RegisterUser {

    @Autowired
    RegisterationServices registerationServices;

    @PostMapping("/store")
    public String storeUserInfo(@RequestBody UserDTO userDto) {
        return registerationServices.createUser(userDto);
    }
}
