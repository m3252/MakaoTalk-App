package com.msc.makaotalkapp.repository;

import com.msc.makaotalkapp.domain.entity.Member;
import com.msc.makaotalkapp.domain.entity.Settings;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class SettingsRepositoryTest {

    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private SettingsRepository settingsRepository;

    @Test
    void givenMember() {
        /*
        given
        테스트 기반 환경을 구축하는 단계
        @builder의 사용법도 같이 확인
        */

        Member memeber1 = memberRepository.getOne(1L);

        settingsRepository.save(Settings.builder()
                .profile("경로")
                .member(memeber1)
                .state_message("상태")
                .state_music("뮤직")
                .build());


        /*when
        테스트 하고자 하는 행위 선언
        여기선 Posts가 DB에 insert 되는것을 확인하기 위함*/
        List<Settings> settingsList = settingsRepository.findAll();
        Settings settings = settingsList.get(0);


        assertThat(settings.getMember().getMember_id()).isEqualTo(memeber1.getMember_id());



    }

}