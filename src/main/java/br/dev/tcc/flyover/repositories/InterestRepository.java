package br.dev.tcc.flyover.repositories;

import br.dev.tcc.flyover.entities.Interest;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface InterestRepository extends JpaRepository<Interest, UUID>{
    
    
    @Query("SELECT COUNT(i) FROM Interest i WHERE i.project.id = :projectId")
    Long countByProjectId(@Param("projectId") UUID projectId);

    boolean existsByProjectIdAndUserId(UUID projectId, UUID userId);

}
