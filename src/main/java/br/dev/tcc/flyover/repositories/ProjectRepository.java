package br.dev.tcc.flyover.repositories;

import br.dev.tcc.flyover.entities.Project;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProjectRepository extends JpaRepository<Project, UUID> {
    
    List<Project> findByStatusIgnoreCase(String status);
    
    List<Project> findByCategoryIgnoreCase(String category);
    
    List<Project> findByBudgetIgnoreCase(String budget);
     
    Optional<Project> findById(UUID id);
}
