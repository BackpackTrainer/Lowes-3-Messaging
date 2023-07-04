package com.example.Messaging3.controllers;

import com.example.Messaging3.services.IMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    private IMessageService messageService;


    @Autowired
    public void setMessageService(IMessageService messageService) {
        this.messageService = messageService;
    }
}
