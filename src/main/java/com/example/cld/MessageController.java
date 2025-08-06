package com.example.cld;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/messages")
public class MessageController {

    private final MessageService messageService;

    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @PostMapping
    public String saveMessage(@RequestBody String content) {
        messageService.saveMessage(content);
        return "Message saved successfully";
    }

    @GetMapping
    public List<String> getAllMessages() {
        return messageService.getAllMessages();
    }
}

