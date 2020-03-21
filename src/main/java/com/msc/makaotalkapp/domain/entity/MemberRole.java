package com.msc.makaotalkapp.domain.entity;

import lombok.*;

import javax.persistence.*;


@Getter
@Entity(name = "m_member_role")
/*
 * Entity 클래스를 프로젝트 코드상에서 기본생성자로 생성하는 것은 막되,
 * JPA에서 Entity 클래스를 생성하는것은 허용하기 위해 추가
 * */
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
public class MemberRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long role_idx;

    @ManyToOne
    @JoinColumn(name="member_id")
    private Member member_id;

    @ManyToOne
    @JoinColumn(name="role_id")
    private Role role_id;

    @Builder
    public MemberRole(Member member_id, Role role_id){
        this.member_id = member_id;
        this.role_id = role_id;
    }

}