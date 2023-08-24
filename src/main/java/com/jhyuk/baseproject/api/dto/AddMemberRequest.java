package com.jhyuk.baseproject.api.dto;

import lombok.Data;

public record AddMemberRequest(String userId, String email, String password) {

}
