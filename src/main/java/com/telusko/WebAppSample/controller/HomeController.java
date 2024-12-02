package com.telusko.WebAppSample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String Welcome(){
        return "Hi, welcome to Homepage";
    }

    @RequestMapping("/about")
    public String aboutMsg(){
        return "sample website";
    }
}
