package com.msc.makaotalkapp.controller;

import com.msc.makaotalkapp.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


/*
* 회원가입, 계정찾기, 비밀번호 찾기
* */

@RestController
public class MemberController {

    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    BCryptPasswordEncoder passwordEncoder;


}
