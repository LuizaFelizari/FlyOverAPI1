package br.dev.tcc.flyover.service;

import br.dev.tcc.flyover.repositories.ProjectRepository;
import br.dev.tcc.flyover.entities.Project;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {
 
    @Autowired
    private ProjectRepository projectRepository;
    
    public List<Project> findAll() {
        
        List<Project> result = projectRepository.findAll();
        return result;
    }
    
    public List<Project> findByStatus(String status) {
        List<Project> result = projectRepository.findByStatusIgnoreCase(status);
        return result;
    }
    
     public List<Project> findByCategory(String category) {
        List<Project> result = projectRepository.findByCategoryIgnoreCase(category);
        return result;
    }
     
     public List<Project> findByBudget(String budget) {
        List<Project> result = projectRepository.findByBudgetIgnoreCase(budget);
        return result;
     }
     
      public Optional<Project> findById(UUID id) {
        Optional<Project> result = projectRepository.findById(id);
        return result;
      }
         
     
    public Project createProject(Project project) {
        return projectRepository.save(project);
        
    }
    public Project save(Project project) {
        return projectRepository.save(project);
    }

    
    public boolean existsById(UUID id) {
        return projectRepository.existsById(id);
    }
    
    public boolean deleteById(UUID id) {
        if (!projectRepository.existsById(id)) {
        return false; 
    }
    projectRepository.deleteById(id);
    
    return true;
    }
}