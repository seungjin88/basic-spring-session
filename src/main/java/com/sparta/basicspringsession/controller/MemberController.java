package com.sparta.basicspringsession.controller;


import com.sparta.basicspringsession.entity.Member;
import com.sparta.basicspringsession.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @PostMapping("/members")
    public void saveMember() {
        memberService.saveMember();
    }

    @GetMapping("/members")
    public List<Member> getMembers() {
        return memberService.getMembers();
    }
}
