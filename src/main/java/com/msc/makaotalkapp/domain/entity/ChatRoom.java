package com.msc.makaotalkapp.domain.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Entity(name = "m_chat_room")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ChatRoom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long chat_id;

    private Long user_id;

    private String message;

    @CreationTimestamp
    private LocalDateTime posted_on;

    private String attachments;

    @Builder
    public ChatRoom(Long user_id, String message, LocalDateTime posted_on, String attachments) {
        this.user_id = user_id;
        this.posted_on = posted_on;
        this.message = message;
        this.attachments = attachments;
    }


}
