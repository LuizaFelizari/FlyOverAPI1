package br.dev.tcc.flyover.repositories;

import br.dev.tcc.flyover.entities.Message;
import java.util.List;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MessageRepository extends JpaRepository<Message, Long>{
    
    List<Message> findByMessageIgnoreCase(String message);
    
    void deleteByUserFromId(UUID id);
    void deleteByUserToId (UUID id);
}
