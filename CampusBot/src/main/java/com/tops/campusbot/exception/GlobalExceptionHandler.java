package com.tops.campusbot.exception;

import com.tops.campusbot.dto.ChatResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ChatResponse> handleException(
            Exception ex) {

        return new ResponseEntity<>(
                new ChatResponse(
                        "Something went wrong.",
                        "ERROR"),
                HttpStatus.INTERNAL_SERVER_ERROR
        );
    }
}
