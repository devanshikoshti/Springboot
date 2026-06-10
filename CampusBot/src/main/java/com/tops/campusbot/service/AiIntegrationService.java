package com.tops.campusbot.service;

import org.springframework.stereotype.Service;

@Service
public class AiIntegrationService {

    public String fetchContextAwareResponse(String question) {

        if(question.toLowerCase().contains("admission")) {
            return "Admissions are open from June to August.";
        }

        if(question.toLowerCase().contains("library")) {
            return "Library timings are 9 AM to 6 PM.";
        }

        return "Please contact the administration office.";
    }
}