package com.asmi.yilimusic.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
@CrossOrigin
public class DefaultController {



    @GetMapping
    public String sayHello(){
        return "Welcome Yili-Music!";
    }

    @GetMapping("/test")
    public String test(){
        return "This is a test!";
    }


}
