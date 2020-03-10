package com.msc.makaotalkapp.service;

import com.msc.makaotalkapp.domain.entity.Member;
import com.msc.makaotalkapp.repository.MemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MemberServiceTest {

    @Autowired
    private MemberService memberService;

    @Autowired
    private MemberRepository memberRepository;

    private void givenMember(String email, LocalDateTime birth, int gender, String phone, String profile, String pw,
                             String state_message, String state_music, String nickname) {

        memberRepository.save(Member.builder()
                .email(email)
                .birth(birth)
                .gender(gender)
                .nickname(nickname)
                .phone(phone)
                .pw(pw)
                .build()
        );
    }

    @Test
    void givenMembers() {
        LocalDateTime now = LocalDateTime.now();
        givenMember("1@naver.com", now, 1, "01045863362",
                "경로", "비밀번호", "가", "나", "홍길동");
        givenMember("2@naver.com", now, 2, "01045863362",
                "경로", "비밀번호", "가", "나", "홍길동");
        givenMember("3@naver.com", now, 3, "01045863362",
                "경로", "비밀번호", "가", "나", "홍길동");

    }

    @Test
    void getMember() {
        Member member = memberService.getMembers(2L);
        System.out.println(member);
    }


}