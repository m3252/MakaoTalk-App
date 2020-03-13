package com.msc.makaotalkapp.repository;

import com.msc.makaotalkapp.domain.entity.Member;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

@SpringBootTest
class MemberRepositoryTest {

    @Autowired
    private MemberRepository memberRepository;

    @Test
    void givenMember() {
        /*
        given
        테스트 기반 환경을 구축하는 단계
        @builder의 사용법도 같이 확인
        */
        LocalDateTime now = LocalDateTime.now();
        memberRepository.save(Member.builder()
                .email("test@naver.com")
                .birth(now)
                .gender(0)
                .nickname("닉네임")
                .phone("010-4586-3362")
                .pw("ㅂㅈㄷㅈㅂ아ㅐㅈㅂ러!@#")
                .build());

        /*when
        테스트 하고자 하는 행위 선언
        여기선 Posts가 DB에 insert 되는것을 확인하기 위함*/
        List<Member> memberList = memberRepository.findAll();
        Member member = memberList.get(0);

        /*then
        테스트 결과 검증
        실제로 DB에 insert 되었는지 확인하기 위해 조회후, 입력된 값 확인*/
        assertThat(member.getEmail()).isEqualTo("test@naver.com");

    }
}