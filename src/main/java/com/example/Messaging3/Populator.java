package com.example.Messaging3;

import com.example.Messaging3.dataAccess.MessageRepository;
import com.example.Messaging3.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Populator implements CommandLineRunner {

    private MessageRepository messageRepository;

    @Autowired
    public Populator(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Message message1 = new Message("Hello World");
        messageRepository.save(message1);

        Message message2 = new Message("GLHF");
        messageRepository.save(message2);

        Message message3 = new Message("It's not raining");
        messageRepository.save(message3);

    }
}
