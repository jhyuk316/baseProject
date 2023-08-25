package com.jhyuk.baseproject.exceptions;

import lombok.Data;

@Data
public class BaseException extends RuntimeException {
    private final ErrorCode errorCode;
}
