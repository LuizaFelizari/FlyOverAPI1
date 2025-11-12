package br.dev.tcc.flyover.service;

import br.dev.tcc.flyover.entities.User;
import br.dev.tcc.flyover.repositories.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;
    
    public List<User> findAll() {
        
        List<User> result = userRepository.findAll();
        return result;
    }
    
    public User createUser(User user) {
        return userRepository.save(user);
    }
}
