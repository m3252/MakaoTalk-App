package com.msc.makaotalkapp.service;

import com.msc.makaotalkapp.domain.entity.Member;
import com.msc.makaotalkapp.repository.MemberRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@Slf4j



public class MemberService {

    @Resource(description = "memberRepository")
    private MemberRepository memberRepository;

    public Member getMembers(Long id){

        Member member =  memberRepository.findById(id).get();

        log.info("param : {}", member);
        return member;
    }

}
