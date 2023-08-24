package com.jhyuk.baseproject.api;


import com.jhyuk.baseproject.api.dto.AddMemberRequest;
import com.jhyuk.baseproject.entity.Member;
import com.jhyuk.baseproject.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("member")
public class MemberApiController {

    private final MemberService memberService;

    @GetMapping
    private ResponseEntity<List<Member>> getMembers() {

        return ResponseEntity.ok().body(List.of(new Member()));
    }

    @GetMapping("{memberId}")
    private ResponseEntity<Member> getMember(@PathVariable long memberId) {

        return ResponseEntity.ok().body(new Member());
    }

    @PostMapping
    private ResponseEntity<Member> addMember(AddMemberRequest addMemberRequest) {
        Member member = memberService.addMember(addMemberRequest);
        return ResponseEntity.ok().body(member);
    }

    @DeleteMapping("{memberId}")
    private ResponseEntity<String> deleteMember(@PathVariable long memberId) {

        return ResponseEntity.ok().body("");
    }


}
