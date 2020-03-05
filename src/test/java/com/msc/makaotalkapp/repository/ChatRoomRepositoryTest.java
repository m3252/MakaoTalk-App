package com.msc.makaotalkapp.repository;

import com.msc.makaotalkapp.entity.ChatRoom;
import com.msc.makaotalkapp.entity.FriendRelation;
import org.junit.After;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ChatRoomRepositoryTest {

    @Autowired
    ChatRoomRepository chatRoomRepository;

    @After
    public void cleanup() {

    }

    @Test
    public void 친구관계불러오기() {
        //given
        LocalDateTime now = LocalDateTime.now();
        chatRoomRepository.save(ChatRoom.builder()
                .user_id((long) 3)
                .message("안녕?")
                .attachments("url")
                .build()
        );
        //when
        List<ChatRoom> chatRoomList = chatRoomRepository.findAll();
        ChatRoom chatRoom = chatRoomList.get(0);


        //then
        assertEquals(chatRoom.getUser_id(), (long) 3);
        assertEquals(chatRoom.getMessage(), "안녕?");


    }

}