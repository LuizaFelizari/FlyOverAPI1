package br.dev.tcc.flyover.entities;

import br.dev.tcc.flyover.entities.User;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "freelancers")
@DiscriminatorValue("FREELANCER")
public class Freelancer extends User {
    
    private String cpf;
    
    public Freelancer(String cpf, UUID id, String login, String senha, String email) {
        super(id, login, senha, email);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Freelancer() {
        //vazio
    }
    
    
}
