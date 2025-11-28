package br.dev.tcc.flyover.controllers;

import br.dev.tcc.flyover.service.ProjectService;
import br.dev.tcc.flyover.entities.Project;
import br.dev.tcc.flyover.repositories.ProjectRepository;
import java.security.Principal;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class ProjectController {
    
    @Autowired
    private ProjectService projectService;
    //retorna os projetos
    
    @GetMapping("/projeto")
    public List<Project> findAll() {
        List<Project> result = projectService.findAll();
        return result;
    }
    
    @GetMapping("/status/{status}")
    public ResponseEntity<List<Project>> findByStatusIgnoreCase(@PathVariable String status) {
        List<Project> result = projectService.findByStatus(status);
        
        if (result.isEmpty()) {
            //not Found 404
            return ResponseEntity.notFound().build();
            
        }else {
            //tem coisa 200
            return ResponseEntity.ok(result);
        }
    }
    
    @GetMapping("/category/{category}")
    public ResponseEntity<List<Project>> findByCategoryIgnoreCase(@PathVariable String category) {
        List<Project> result = projectService.findByCategory(category);
        
        if (result.isEmpty()) {
            //not Found 404
            return ResponseEntity.notFound().build();
            
        }else {
            //tem coisa 200
            return ResponseEntity.ok(result);
        }
    }
    
    @GetMapping("/budget/{budget}")
    public ResponseEntity<List<Project>> findByBudgetIgnoreCase(@PathVariable String budget) {
        List<Project> result = projectService.findByBudget(budget);
        
        if (result.isEmpty()) {
            //not Found 404
            return ResponseEntity.notFound().build();
            
        }else {
            //tem coisa 200
            return ResponseEntity.ok(result);
        }
    }
    
     @GetMapping("/id/{id}")
    public ResponseEntity<Optional<Project>> findById(@PathVariable UUID id) {
        Optional<Project> result = projectService.findById(id);
        
        if (result.isEmpty()) {
            //not Found 404
            return ResponseEntity.notFound().build();
            
        }else {
            //tem coisa 200
            return ResponseEntity.ok(result);
        }
    }
    
    
    @PutMapping("/projeto/{id}")
    public ResponseEntity<Project> atualizar(@PathVariable UUID id,
                                             @RequestBody Project project){
        if (!projectService.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        
        project.setId(id);
        project = projectService.save(project);
        return ResponseEntity.ok(project);
    }
    
    
    @PostMapping("/projeto")
    public ResponseEntity<Project> createProject(@RequestBody Project projeto) {
        
        Project p = projectService.createProject(projeto);
        
        if ( p != null) {
            return ResponseEntity.status(HttpStatus.CREATED).body(p);
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(projeto);
        }
        
    }
    
    @DeleteMapping("/projeto/{id}")
        public ResponseEntity<Void> excluir(@PathVariable UUID id) {
        //ve se existe ou não
        
        if (!projectService.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        projectService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
      
        
        
      

    //@PostMapping("/projeto/{Id}/interest")
        //public ResponseEntity<Void> demonstrateInterest(@PathVariable UUID projectId, Principal principal) {
    
    
    //UUID userId = UUID.fromString(principal.getName());
    
    //projectService.registerInterest(projectId, userId);
    
    //return ResponseEntity.ok().build();
}

    //@GetMapping("/projeto/{Id}/interest/count")
        //public ResponseEntity<Long> getInterestCount(@PathVariable UUID projectId) {
    
    //Long count = projectService.getInterestCount(projectId);
    
    //return ResponseEntity.ok(count);
//}
      
