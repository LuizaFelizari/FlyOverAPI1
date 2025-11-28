package br.dev.tcc.flyover.service;

import br.dev.tcc.flyover.entities.User;
import br.dev.tcc.flyover.repositories.MessageRepository;
import br.dev.tcc.flyover.repositories.UserRepository;
import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;
    
    @Autowired
    private MessageRepository messageRepository;
    
    public List<User> findAll() {
        
        List<User> result = userRepository.findAll();
        return result;
    }
    
    public User createUser(User user) {
        return userRepository.save(user);
    }
    
    public boolean existsById(UUID id) {
        return userRepository.existsById(id);
    }
    
    @Transactional
    public void deleteById(UUID id) {
        // Primeiro deleta as mensagens
        messageRepository.deleteByUserFromId(id);
        //mensagens que ele recebeu
        messageRepository.deleteByUserToId(id);
        // Depois deleta o usuário
        userRepository.deleteById(id);
    }  
}

    

