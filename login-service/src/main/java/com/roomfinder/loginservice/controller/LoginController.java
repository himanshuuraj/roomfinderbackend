package com.roomfinder.loginservice.controller;

import com.roomfinder.loginservice.RoomServiceProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    RoomServiceProxy roomServiceProxy;

    @GetMapping("loginController")
    public String loginController(){
        String str = roomServiceProxy.roomController();
        return str;
    }
}
