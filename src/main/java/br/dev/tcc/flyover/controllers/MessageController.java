package br.dev.tcc.flyover.controllers;

import br.dev.tcc.flyover.entities.Message;
import br.dev.tcc.flyover.service.MessageService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class MessageController {
    
     @Autowired
    private MessageService messageService;
    
    @GetMapping("/message")
    public List<Message> findAll() {
        List<Message> result = messageService.findAll();
                return result;
    }
        
    @PostMapping("/message")
    public ResponseEntity<Message> createMessage(@RequestBody Message message) {
        
        Message m = messageService.createMessage(message);
        
        if ( m != null) {
            return ResponseEntity.status(HttpStatus.CREATED).body(m);
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(message);
        }
        
    }
}
