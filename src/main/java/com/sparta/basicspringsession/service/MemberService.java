package com.sparta.basicspringsession.service;

import com.sparta.basicspringsession.entity.Member;
import com.sparta.basicspringsession.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public void saveMember() {
        Member member = new Member("새로운 맴버");
        memberRepository.save(member);

    }

    public List<Member> getMembers() {
        return memberRepository.findAll();
    }
}
