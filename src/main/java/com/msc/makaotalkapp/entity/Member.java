package com.msc.makaotalkapp.entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Entity(name="m_member")
/*
 * Entity 클래스를 프로젝트 코드상에서 기본생성자로 생성하는 것은 막되,
 * JPA에서 Entity 클래스를 생성하는것은 허용하기 위해 추가
 * */

@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long member_id;

    @Column
    private String email;

    @Column
    private String pw;

    @Column
    private String profile;

    @Column
    private String nickname;

    @Column
    private int birth;

    @Column
    private String phone;

    @Column
    private int gender;

    @Column
    private String state_message;

    @Column
    private String state_music;

    @Column
    @CreationTimestamp
    private LocalDateTime r_date;

    @Column
    @UpdateTimestamp
    private LocalDateTime m_date;

    @Builder
    public Member(String email, String pw, String profile, String nickname, int birth, String phone, int gender, String state_message, String state_music, LocalDateTime r_date, LocalDateTime m_date) {
        this.email = email;
        this.pw = pw;
        this.profile = profile;
        this.nickname = nickname;
        this.birth = birth;
        this.phone = phone;
        this.gender = gender;
        this.state_message = state_message;
        this.state_music = state_music;
        this.r_date = r_date;
        this.m_date = m_date;
    }

}
