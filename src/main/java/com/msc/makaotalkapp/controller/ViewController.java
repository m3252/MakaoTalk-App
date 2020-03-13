package com.msc.makaotalkapp.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/*
* 화면을 처리
* */

@Api(tags = {"0. View"})
@Controller
@RequestMapping(value = "/v1")
public class ViewController {

    @ApiOperation(value = "로그인 화면 조회", notes = "로그인 화면을 조회한다.")
    @GetMapping("/login/view")
    public void login(){ }

    @ApiOperation(value = "회원가입 화면 조회", notes = "회원가입 화면을 조회한다.")
    @GetMapping("/sign-up/view")
    public void signUp(){}

}
