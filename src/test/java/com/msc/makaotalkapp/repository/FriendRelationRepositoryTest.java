package com.msc.makaotalkapp.repository;

import com.msc.makaotalkapp.entity.FriendRelation;
import org.junit.After;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FriendRelationRepositoryTest {

    @Autowired
    FriendRelationRepository friendRelationRepository;

    @After
    public void cleanup() {
        friendRelationRepository.deleteAll();
    }

    @Test
    public void 친구관계불러오기() {
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
        assertEquals(friendRelation.getFriend_id(), (long) 2);
        assertEquals(friendRelation.getFriend_nickname(), "홍길동");


    }
}