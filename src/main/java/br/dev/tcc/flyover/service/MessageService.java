package br.dev.tcc.flyover.service;

import br.dev.tcc.flyover.entities.Message;
import br.dev.tcc.flyover.repositories.MessageRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
    
    @Autowired
    private MessageRepository messageRepository;
    
    public List<Message> findAll() {
         
        List<Message> result = messageRepository.findAll();
        return result;
    }
    public Message createMessage(Message message) {
        return messageRepository.save(message);
    }
}