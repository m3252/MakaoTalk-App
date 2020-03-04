package com.msc.makaotalkapp.repository;

import com.msc.makaotalkapp.entity.Member;

import org.junit.After;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


@RunWith(SpringRunner.class)
@SpringBootTest
public class MemberRepositoryTest {

    @Autowired
    MemberRepository memberRepository;

    @After
    public void cleanup() {
        /**
         이후 테스트 코드에 영향을 끼치지 않기 위해
         테스트 메소드가 끝날때 마다 respository 전체 비우는 코드
         **/

        memberRepository.deleteAll();
    }

    @Test
    public void 목록불러오기() {

        /*
        given
        테스트 기반 환경을 구축하는 단계
        @builder의 사용법도 같이 확인
        */
        memberRepository.save(Member.builder()
                .email("test@naver.com")
                .birth(19910319)
                .gender(0)
                .nickname("닉네임")
                .phone("010-4586-3362")
                .profile("프로필경로")
                .pw("ㅂㅈㄷㅈㅂ아ㅐㅈㅂ러!@#")
                .state_message("1023")
                .state_music("23123")
                .build());

        /*when
        테스트 하고자 하는 행위 선언
        여기선 Posts가 DB에 insert 되는것을 확인하기 위함*/
        List<Member> memberList = memberRepository.findAll();
        Member member = memberList.get(0);

        /*then
        테스트 결과 검증
        실제로 DB에 insert 되었는지 확인하기 위해 조회후, 입력된 값 확인*/
        assertEquals(member.getEmail(), "test@naver.com");
        assertEquals(member.getProfile(), "프로필경로");


    }
}