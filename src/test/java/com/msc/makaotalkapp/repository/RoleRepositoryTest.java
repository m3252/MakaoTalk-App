package com.msc.makaotalkapp.repository;

import com.msc.makaotalkapp.domain.entity.Member;
import com.msc.makaotalkapp.domain.entity.MemberRole;
import com.msc.makaotalkapp.domain.entity.Role;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class RoleRepositoryTest {

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private MemberRoleRepository memberRoleRepository;

    @Autowired
    private MemberRepository memberRepository;

//    @BeforeEach
//    void resetRoleData(){
//        roleRepository.deleteAll();
//    }


    @Test
    void createRole(){
        Role role1 = Role.builder().role_name("user").build();
        Role role2 = Role.builder().role_name("admin").build();

        Stream<Role> s = Stream.of(role1, role2);
        s.forEach(roleRepository :: save);
    }

    @Test
    void mappingRole(){

        List<Member> members = memberRepository.findAll();
        List<Role> roles = roleRepository.findAll();

        Optional<Member> memberOptional = members.stream()
                .filter(f -> 3L == (f.getMember_id()))
                .findFirst();

        Member member = memberOptional.get();

        Optional<Role> roleOptional = roles.stream()
                .filter(f -> "user".equals(f.getRole_name()))
                .findAny();

        Role role = roleOptional.get();

        memberRoleRepository.save(MemberRole.builder()
                .member_id(member)
                .role_id(role)
                .build()
        );

    }
}