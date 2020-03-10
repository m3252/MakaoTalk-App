package com.msc.makaotalkapp.repository;

import com.msc.makaotalkapp.domain.entity.ChatRoom;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ChatRoomRepositoryTest {

    @Autowired
    private ChatRoomRepository chatRoomRepository;

    @Test
    void givenChat() {
        chatRoomRepository.deleteAll();
        //given
//        LocalDateTime now = LocalDateTime.now();
//        chatRoomRepository.save(ChatRoom.builder()
//                .message("안녕?")
//                .attachments("url")
//                .build()
//        );
//        //when
//        List<ChatRoom> chatRoomList = chatRoomRepository.findAll();
//        ChatRoom chatRoom = chatRoomList.get(0);
//
//
//        //then
//        assertEquals(chatRoom.getUser_id(), (long) 3);
//        assertEquals(chatRoom.getMessage(), "안녕?");
//


    }

}