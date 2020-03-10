package com.msc.makaotalkapp.domain.entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Entity(name = "m_chat")
@IdClass(Chat.class)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Chat implements Serializable {

    @Id
    private Long room_id;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long chat_idx;

    @Column(nullable = false)
    private Long user_id;

    @Column(nullable = false)
    private String message;

    private String attachments;

    @Column(nullable = false)
    @CreationTimestamp
    private LocalDateTime posted_on;


    @Builder
    public Chat(Long room_id, Long user_id,  String attachments, String message) {
        this.room_id = room_id;
        this.user_id = user_id;
        this.attachments = attachments;
        this.message = message;
    }

}
