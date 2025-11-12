package br.dev.tcc.flyover.repositories;

import br.dev.tcc.flyover.entities.User;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository <User, UUID> {
    
   
}
