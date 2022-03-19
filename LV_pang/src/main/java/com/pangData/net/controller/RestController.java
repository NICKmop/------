package com.pangData.net.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RestController{

    @GetMapping("/main/main")
    public String pang(){
        return "main/main";
    }
}