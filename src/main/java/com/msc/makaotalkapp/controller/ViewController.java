package com.msc.makaotalkapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/*
* 화면을 처리
* */

@Controller
public class ViewController {

    @GetMapping("/login")
    public void login(){ }

    @GetMapping("/signUp")
    public void signUp(){ }


}
