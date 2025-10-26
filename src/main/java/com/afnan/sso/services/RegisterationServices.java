package com.afnan.sso.services;

import com.afnan.sso.dto.UserDTO;
import com.afnan.sso.entities.User;
import com.afnan.sso.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class RegisterationServices {

    public static final Logger log = Logger.getLogger(RegisterationServices.class.getName());

    @Autowired
    private UserRepo userRepo;

    public String createUser(UserDTO userDto) {
        String response = "";
        try{
            User user = new User();
            user.setUsername(userDto.getUsername());
            user.setPassword(encryptPassword(userDto.getPassword()));
            log.info("password encryption successfull !!!");
            user.setActive(1L);
            user.setFailedLoginAttempts(0L);
            response = "user: "+user.getUsername()+", Saved Successfully";
            userRepo.save(user);
        }catch(Exception e){
            response = e.getMessage();
        }
        return  response;
    }
    public String encryptPassword(String password) {
        return "123@"+password+"afnan";
    }


}
