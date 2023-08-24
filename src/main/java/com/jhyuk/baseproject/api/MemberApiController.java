package com.jhyuk.baseproject.api;


import com.jhyuk.baseproject.api.dto.AddMemberRequest;
import com.jhyuk.baseproject.entity.Member;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("member")
public class MemberApiController {

    @GetMapping
    private ResponseEntity<List<Member>> getMembers(){

        return ResponseEntity.ok().body(List.of(new Member()));
    }

    @GetMapping("{memberId}")
    private  ResponseEntity<Member> getMember(@PathVariable long memberId){

        return ResponseEntity.ok().body(new Member());
    }
    @PostMapping
    private ResponseEntity<Member> addMember(AddMemberRequest addMemberRequest){

        return ResponseEntity.ok().body(new Member());
    }

    @DeleteMapping("{memberId}")
    private ResponseEntity<String> deleteMember(@PathVariable long memberId){

        return ResponseEntity.ok().body("");
    }




}
