package br.dev.tcc.flyover.controllers;

import br.dev.tcc.flyover.entities.User;
import br.dev.tcc.flyover.service.UserService;
import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
    
    @Autowired
    private UserService userService;
    
    @GetMapping("/user")
    public List<User> findAll() {
     List<User> result = userService.findAll();
     return result; 
    }
    
    @PostMapping("/user")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User u = userService.createUser(user);
        
        if ( u != null) {
            return ResponseEntity.status(HttpStatus.CREATED).body(u);
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(user);
        }
        
    }
    
    @DeleteMapping("/user/{id}")
    public ResponseEntity<Void> excluir(@PathVariable UUID id) {

    if (!userService.existsById(id)) {
        return ResponseEntity.notFound().build();
    }

    userService.deleteById(id);
    return ResponseEntity.noContent().build();
}

}