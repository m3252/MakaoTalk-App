package com.msc.makaotalkapp.domain.entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Entity(name="m_settings")
@IdClass(Settings.class)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
public class Settings implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long settings_idx;

    @Id
    private Long user_id;

    private String profile;

    private String state_message;

    private String state_music;

    @Column
    @CreationTimestamp
    private LocalDateTime r_date;

    @Builder
    public Settings(Long user_id, String profile, String state_message, String state_music){
        this.user_id = user_id;
        this.profile = profile;
        this.state_message = state_message;
        this.state_music = state_music;
    }

}
