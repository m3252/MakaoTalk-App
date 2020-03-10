package com.msc.makaotalkapp.domain.entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Entity(name="m_friend_relation")
@IdClass(FriendRelation.class)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class FriendRelation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long relation_id;

    @Id
    private Long user_id;

    @Column(nullable = false)
    private Long friend_id;

    private String friend_nickname;

    private int status;

    @Column(nullable = false)
    private int relationship;

    @Column
    @CreationTimestamp
    private LocalDateTime r_date;

    @Builder
    public FriendRelation(Long user_id, Long friend_id, String friend_nickname, int status, int relationship){
        this.user_id = user_id;
        this.friend_id = friend_id;
        this.friend_nickname = friend_nickname;
        this.status = status;
        this.relationship = relationship;
    }

}
