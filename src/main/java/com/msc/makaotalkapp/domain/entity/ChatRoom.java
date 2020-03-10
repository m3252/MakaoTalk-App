package com.msc.makaotalkapp.domain.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Entity(name = "m_chat_room")
@IdClass(ChatRoom.class)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ChatRoom implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long room_id;

    @Id
    private Long access_id;

    private String room_name;

    @Builder
    public ChatRoom(Long access_id, String room_name){
        this.access_id = access_id;
        this.room_name = room_name;
    }

}
