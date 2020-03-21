package com.msc.makaotalkapp.domain.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Entity(name="m_role")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long role_id;

    private String role_name;

    @Builder
    public Role(String role_name) {
        this.role_name = role_name;
    }
}
