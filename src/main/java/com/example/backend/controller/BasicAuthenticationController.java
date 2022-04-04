package com.example.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class BasicAuthenticationController {

    @Autowired
    private Environment env;

    @GetMapping(path="/auth-api")
    public String getAuthenticationStatus(){
        String info = env.getProperty("customUsername");
        return info;
    }

}
