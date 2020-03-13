package com.msc.makaotalkapp.domain.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity(name = "m_chat_room")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ChatRoom{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long room_id;

    @ManyToOne
    @JoinColumn(referencedColumnName = "member_id", name="access_id")
    private Member access_id;

    private String room_name;

    @Builder
    public ChatRoom(Member access_id, String room_name) {
        this.access_id = access_id;
        this.room_name = room_name;
    }

}
