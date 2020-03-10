package com.msc.makaotalkapp.controller;


import com.msc.makaotalkapp.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/*
* 로그인을 처리
* */
@RestController
public class LoginController {

    @Autowired
    private MemberRepository memberRepository;


}
