package com.jhyuk.baseproject.api;

import com.jhyuk.baseproject.api.dto.BaseResponse;
import com.jhyuk.baseproject.exceptions.BaseException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionController {

    @ExceptionHandler(BaseException.class)
    public ResponseEntity<BaseResponse<Object>> baseErrorResponse(BaseException e) {
        BaseResponse<Object> objectBaseResponse = new BaseResponse<>(e.getErrorCode());
        return ResponseEntity.badRequest().body(objectBaseResponse);
    }
}
