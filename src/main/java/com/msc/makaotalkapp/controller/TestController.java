package com.msc.makaotalkapp.controller;

import com.msc.makaotalkapp.entity.Member;
import com.msc.makaotalkapp.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

//@RestController는 모든 메소드에 @ResponseBody를 적용해준다.
@RestController
public class TestController {

    @Autowired
    MemberRepository memberRepository;

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
