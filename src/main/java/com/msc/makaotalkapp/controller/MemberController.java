package com.msc.makaotalkapp.controller;

import com.msc.makaotalkapp.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.RestController;

/*
* 회원가입, 계정찾기, 비밀번호 찾기
* */

@RequiredArgsConstructor
@RestController
public class MemberController {

    private final MemberRepository memberRepository;



}
