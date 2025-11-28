package br.dev.tcc.flyover.repositories;

import br.dev.tcc.flyover.entities.Project;
import br.dev.tcc.flyover.entities.User;
import java.util.Optional;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository <User, UUID> {
    
   Optional<User> findById(UUID id);
   
   void deleteById(UUID id);

}
