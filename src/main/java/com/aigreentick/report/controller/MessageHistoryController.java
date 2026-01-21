package com.aigreentick.report.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import com.aigreentick.report.dto.MessageHistoryPageResponse;

import java.time.LocalDateTime;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class MessageHistoryController {


    @GetMapping("/get-messages-history")
    public MessageHistoryPageResponse  getMessagesHistory(
            @RequestParam Long userId,
            @RequestParam(defaultValue = "15") int perPage,
            @RequestParam(defaultValue = "1") int page,
            @RequestParam(required = false) String search,
            @RequestParam(required = false) String filter,
            @RequestParam(required = false) LocalDateTime fromDate,
            @RequestParam(required = false) LocalDateTime toDate
    ) {

        return null;
        
    }
}

