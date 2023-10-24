package com.abdullah.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OAuthController {

    @GetMapping("/home")
    public String home(){
        return "Welcome to Home!";
    }
    @GetMapping("/Secured")
    public String secured(){
        return "Welcome to Secured page with auth completion!";
    }
}
