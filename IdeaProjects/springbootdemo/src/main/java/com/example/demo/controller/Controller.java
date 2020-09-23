package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {
    @RequestMapping("/index")
    public String sayHello(){
        return "index";
    }
}
