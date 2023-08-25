package com.jhyuk.baseproject.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {

    SUCCESS(""), INVALID_PARAM("Invalid Parameter"), NOT_FOUND("Not Found Data"), unknown("unkwon");

    private final String errorMessage;
}
