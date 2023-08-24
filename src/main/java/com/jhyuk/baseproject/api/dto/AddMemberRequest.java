package com.jhyuk.baseproject.api.dto;

import com.jhyuk.baseproject.entity.Member;

public record AddMemberRequest(String userId, String email, String password) {

    public Member toEntity() {
        Member member = new Member();
        member.setEmail(this.email);
        member.setPassword(this.password);
        return member;
    }
}
