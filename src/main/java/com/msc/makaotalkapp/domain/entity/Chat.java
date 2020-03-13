package com.msc.makaotalkapp.domain.entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Entity(name = "m_chat")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Chat {

    @Id
    private Long chat_idx;

    @ManyToOne
    @JoinColumn(referencedColumnName = "room_id", name="room_id")
    private ChatRoom room_id;

    @ManyToOne
    @JoinColumn(referencedColumnName = "member_id", name="user_id")
    private Member user_id;

    @Column(nullable = false)
    private String message;

    private String attachments;

    @Column(nullable = false)
    @CreationTimestamp
    private LocalDateTime posted_on;


    @Builder
    public Chat(ChatRoom room_id, Member user_id,  String attachments, String message) {
        this.room_id = room_id;
        this.user_id = user_id;
        this.attachments = attachments;
        this.message = message;
    }

}
