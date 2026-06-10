package com.tops.campusbot.controller;

import com.tops.campusbot.dto.ChatRequest;
import com.tops.campusbot.dto.ChatResponse;
import com.tops.campusbot.service.AiIntegrationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/chat")
public class ChatController {

    private final AiIntegrationService aiService;

    public ChatController(AiIntegrationService aiService) {
        this.aiService = aiService;
    }

    @PostMapping
    public ResponseEntity<ChatResponse> askQuestion(
            @RequestBody ChatRequest request) {

        String answer =
                aiService.fetchContextAwareResponse(
                        request.getQuestion());

        return ResponseEntity.ok(
                new ChatResponse(answer, "SUCCESS")
        );
    }
}