package com.jhyuk.baseproject.api.dto;

import com.jhyuk.baseproject.entity.Member;

public record AddMemberRequest(String userId, String email, String password) {

    public Member toEntity() {

        return Member.builder()
                .email(this.email)
                .password(this.password)
                .build();
    }
}
