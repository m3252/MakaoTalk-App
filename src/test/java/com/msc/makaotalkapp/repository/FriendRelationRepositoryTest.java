package com.msc.makaotalkapp.repository;

import com.msc.makaotalkapp.domain.entity.FriendRelation;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class FriendRelationRepositoryTest {

    @Autowired
    private FriendRelationRepository friendRelationRepository;

    @Test
    void givenFriends() {

        friendRelationRepository.deleteAll();

        //given
        LocalDateTime now = LocalDateTime.now();
        friendRelationRepository.save(FriendRelation.builder()
                .user_id((long) 1)
                .friend_id((long) 2)
                .friend_nickname("홍길동")
                .relationship(0)
                .status(0)
                .build());
        //when
        List<FriendRelation> friendList = friendRelationRepository.findAll();
        FriendRelation friendRelation = friendList.get(0);

        //then
        assertThat(friendRelation.getFriend_id()).isEqualTo((long) 2);
        assertThat(friendRelation.getFriend_nickname()).isEqualTo("홍길동");


    }
}