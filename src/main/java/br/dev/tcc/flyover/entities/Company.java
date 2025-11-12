package br.dev.tcc.flyover.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "companies")
@DiscriminatorValue("COMPANY")
public class Company extends User {
    
    private String cnpj;
    
    public Company(UUID id, String login, String senha, String email) {
        super(id, login, senha, email);
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Company() {
        //vazio
    }
    
    
}
