package com.cis.batch33.library.service;

import com.cis.batch33.library.model.Member;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@Service
public class MemberService {

    private Map<Long, Member> memberMap = new HashMap<>();

    public Member createMember(Member member){

        // call the database
        Long memberId = new Random().nextLong();
        member.setMemberId(memberId);
        memberMap.put(memberId, member);
        return  member;
    }


    public Member getMember(Long memberId) {
        return memberMap.get(memberId);

    }

    public Member updateMember(Member member) {
        Long memberId = member.getMemberId();
        memberMap.put(memberId, member);
        return member;
    }

    public void deleteMember(Long memberId) {
        memberMap.remove(memberId);
    }
}