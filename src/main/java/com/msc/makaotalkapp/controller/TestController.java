package com.msc.makaotalkapp.controller;

import com.msc.makaotalkapp.domain.entity.Member;
import com.msc.makaotalkapp.repository.MemberRepository;
import com.msc.makaotalkapp.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

//@RestController는 @Controller, @ResponseBody를 적용해준다.
@RequiredArgsConstructor
@RestController
public class TestController {

    private final MemberRepository memberRepository;
    private final MemberService memberService;

    @GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }

    @GetMapping("/readAll")
    public Optional readAll(String id) {
        return memberRepository.findById((long) 1);
    }


    @GetMapping("/create")
    public void create(Member member) {
        memberRepository.save(member);
    }

    @GetMapping("/delete")
    public void delete(String id) { memberRepository.deleteById((long)1);
    }




}
