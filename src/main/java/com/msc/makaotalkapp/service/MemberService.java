package com.msc.makaotalkapp.service;

import com.msc.makaotalkapp.domain.entity.Member;
import com.msc.makaotalkapp.repository.MemberRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class MemberService {

    @Autowired
    private MemberRepository memberRepository;

    public Member getMembers(Long id){

        Member member =  memberRepository.findById(id).get();

        log.info("param : {}", member);
        return member;
    }

}
