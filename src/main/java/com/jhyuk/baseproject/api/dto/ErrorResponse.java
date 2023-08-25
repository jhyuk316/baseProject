package com.jhyuk.baseproject.api.dto;

import com.jhyuk.baseproject.exceptions.ErrorCode;

public record ErrorResponse(String code, String status, String message) {

    public ErrorResponse(ErrorCode errorCode) {
        this(errorCode.name(), errorCode.name(), errorCode.getErrorMessage());
    }
}
