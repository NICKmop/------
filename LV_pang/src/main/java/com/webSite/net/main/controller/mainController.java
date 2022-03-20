package com.webSite.net.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class mainController {

    @GetMapping("/")
    public ModelAndView home(){
        ModelAndView mv = new ModelAndView();

        mv.setViewName("main");

        return mv;
    }
}
