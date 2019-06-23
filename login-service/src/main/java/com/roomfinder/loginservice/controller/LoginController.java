package com.roomfinder.loginservice.controller;

//import com.roomfinder.loginservice.RoomServiceProxy;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import it.ozimov.springboot.mail.model.Email;
import it.ozimov.springboot.mail.model.defaultimpl.DefaultEmail;
import it.ozimov.springboot.mail.service.EmailService;

import java.io.IOException;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

import org.springframework.beans.factory.annotation.Autowired;

import static com.google.common.collect.Lists.newArrayList;

@RestController
public class LoginController {

//    @Autowired
//    RoomServiceProxy roomServiceProxy;
	
	@Autowired
    private EmailService emailService;

    @GetMapping("loginController")
    public String loginController(){
        //String str = roomServiceProxy.roomController();
        return "str";
    }
    
    @GetMapping("/send-email")
    public String sendEmail() throws AddressException, MessagingException, IOException {
    	final Email email = DefaultEmail.builder()
                .from(new InternetAddress("hraj3116@gmail.com",
                        "Hari Seldon"))
                .to(newArrayList(
                        new InternetAddress("hraj3116@gmail.com",
                        "Cleon I")))
                .subject("You shall die! It's not me, it's Psychohistory")
                .body("Hello Planet!")
                .encoding("UTF-8").build();

        emailService.send(email);
    	return "success";
    }
}
