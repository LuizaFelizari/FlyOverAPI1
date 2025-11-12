package br.dev.tcc.flyover.repositories;

import br.dev.tcc.flyover.entities.Message;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MessageRepository extends JpaRepository<Message, Long>{
    
    List<Message> findByMessageIgnoreCase(String message);
}
