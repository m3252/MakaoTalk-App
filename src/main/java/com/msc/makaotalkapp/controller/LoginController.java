package com.msc.makaotalkapp.controller;


import com.msc.makaotalkapp.repository.MemberRepository;
import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/*
* 로그인을 처리
* */
@Api(tags = {"1. User"})
@RequiredArgsConstructor
@RequestMapping(value = "/v1")
@RestController
public class LoginController {

    private final MemberRepository memberRepository;




}
