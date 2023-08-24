package com.jhyuk.baseproject.service;

import com.jhyuk.baseproject.api.dto.AddMemberRequest;
import com.jhyuk.baseproject.entity.Member;
import com.jhyuk.baseproject.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    public Member addMember(AddMemberRequest addMemberRequest) {
        Member entity = addMemberRequest.toEntity();
        return memberRepository.save(entity);
    }
}
