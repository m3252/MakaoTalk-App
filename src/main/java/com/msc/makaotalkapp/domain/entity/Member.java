package com.msc.makaotalkapp.domain.entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Entity(name = "m_member")
/*
 * Entity 클래스를 프로젝트 코드상에서 기본생성자로 생성하는 것은 막되,
 * JPA에서 Entity 클래스를 생성하는것은 허용하기 위해 추가
 * */

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long member_id;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String pw;

    @Column(nullable = false)
    private String nickname;

    @Column(nullable = false)
    private LocalDateTime birth;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private int gender;


    @Column
    @CreationTimestamp
    private LocalDateTime r_date;

    @Column
    @UpdateTimestamp
    private LocalDateTime m_date;

    @Builder
    public Member(String email, String pw, String nickname, LocalDateTime birth, String phone, int gender) {
        this.email = email;
        this.pw = pw;
        this.nickname = nickname;
        this.birth = birth;
        this.phone = phone;
        this.gender = gender;
    }

}
