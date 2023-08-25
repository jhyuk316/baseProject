package com.jhyuk.baseproject.api;

import com.jhyuk.baseproject.api.dto.ErrorResponse;
import com.jhyuk.baseproject.exceptions.BaseException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionController {

    @ExceptionHandler(BaseException.class)
    public ResponseEntity<ErrorResponse> baseErrorResponse(BaseException e) {
        ErrorResponse errorResponse = new ErrorResponse(e.getErrorCode());
        return ResponseEntity.badRequest().body(errorResponse);
    }
}
