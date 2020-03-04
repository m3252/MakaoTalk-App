package com.msc.makaotalkapp.entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Entity(name="m_friend_relation")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class FriendRelation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long relation_id;

    @Column
    private Long user_id;

    @Column
    private Long friend_id;

    @Column
    private String friend_nickname;

    @Column
    private int status;

    @Column
    private int relationship;

    @Column
    @CreationTimestamp
    private LocalDateTime r_date;

    @Builder
    public FriendRelation(Long user_id, Long friend_id, String friend_nickname, int status, int relationship, LocalDateTime r_date) {
        this.user_id = user_id;
        this.friend_id = friend_id;
        this.friend_nickname = friend_nickname;
        this.status = status;
        this.relationship = relationship;
        this.r_date = r_date;
    }
}
