package com.msc.makaotalkapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/*
* 화면을 처리
* */

@Controller
public class ViewController {

    @GetMapping("/login/view")
    public String login(){
        return "login";
    }

    @GetMapping("/sign-up/view")
    public String signUp(){
        return "sign-up";
    }

}
