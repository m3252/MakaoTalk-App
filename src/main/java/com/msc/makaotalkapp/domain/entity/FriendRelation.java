package com.msc.makaotalkapp.domain.entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Entity(name="m_friend_relation")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class FriendRelation{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long relation_id;

    @ManyToOne
    @JoinColumn(referencedColumnName = "member_id", name="user_id")
    private Member user_id;

    @ManyToOne
    @JoinColumn(referencedColumnName = "member_id", name="friend_id")
    private Member friend_id;

    private String friend_nickname;

    private int status;

    @Column(nullable = false)
    private int relationship;

    @Column
    @CreationTimestamp
    private LocalDateTime r_date;

    @Builder
    public FriendRelation(Member user_id, Member friend_id, String friend_nickname, int status, int relationship){
        this.user_id = user_id;
        this.friend_id = friend_id;
        this.friend_nickname = friend_nickname;
        this.status = status;
        this.relationship = relationship;
    }

}
