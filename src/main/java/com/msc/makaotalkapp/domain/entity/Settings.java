package com.msc.makaotalkapp.domain.entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Entity(name="m_settings")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
public class Settings{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long settings_idx;

    @ManyToOne
    @JoinColumn(referencedColumnName = "member_id", name="member_id")
    private Member member;

    private String profile;

    private String state_message;

    private String state_music;

    @Column
    @CreationTimestamp
    private LocalDateTime r_date;

    @Builder
    public Settings(Member member, String profile, String state_message, String state_music){
        this.member = member;
        this.profile = profile;
        this.state_message = state_message;
        this.state_music = state_music;
    }

}
