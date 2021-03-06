/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ap.portfolio.controller;

import com.ap.portfolio.model.Login;
import com.ap.portfolio.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ControllerLogin {
       @Autowired
    LoginService loginService;
    
    @PostMapping("/login")
    public boolean login(@RequestBody Login login) {
        return loginService.isUserEnabled(login);
    }
}