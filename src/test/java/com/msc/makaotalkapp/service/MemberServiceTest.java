package com.msc.makaotalkapp.service;

import com.msc.makaotalkapp.domain.entity.Member;
import com.msc.makaotalkapp.repository.MemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MemberServiceTest {

    @Autowired
    private MemberService memberService;

    @Autowired
    private MemberRepository memberRepository;

    private void givenMember(String email, int birth, int gender, String phone, String profile, String pw,
                             String state_message, String state_music, String nickname) {

        memberRepository.save(Member.builder()
                .email(email)
                .birth(birth)
                .gender(gender)
                .nickname(nickname)
                .phone(phone)
                .profile(profile)
                .pw(pw)
                .state_message(state_message)
                .state_music(state_music)
                .build()
        );
    }

    @Test
    void givenMembers() {
        givenMember("1@naver.com", 19910319, 1, "01045863362",
                "경로", "비밀번호", "가", "나", "홍길동");
        givenMember("2@naver.com", 19910319, 2, "01045863362",
                "경로", "비밀번호", "가", "나", "홍길동");
        givenMember("3@naver.com", 19910319, 3, "01045863362",
                "경로", "비밀번호", "가", "나", "홍길동");

    }

    @Test
    void getMember() {
        Member member = memberService.getMembers(2L);
        System.out.println(member);
    }


}