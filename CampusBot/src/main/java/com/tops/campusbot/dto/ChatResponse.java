package com.tops.campusbot.dto;

import java.time.Instant;

public class ChatResponse {

    private String answer;
    private String status;
    private String timestamp;

    public ChatResponse(String answer, String status) {
        this.answer = answer;
        this.status = status;
        this.timestamp = Instant.now().toString();
    }

    public String getAnswer() {
        return answer;
    }

    public String getStatus() {
        return status;
    }

    public String getTimestamp() {
        return timestamp;
    }
}