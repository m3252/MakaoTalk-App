package com.msc.makaotalkapp.controller;


import com.msc.makaotalkapp.repository.MemberRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.RestController;


/*
* 로그인을 처리
* */
@RequiredArgsConstructor
@RestController
public class LoginController {

    private final MemberRepository memberRepository;




}
