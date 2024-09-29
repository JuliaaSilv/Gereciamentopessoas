package com.backend.trabalhodejava.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "PESSOA_TB")
public class Pessoa {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private UUID id;

private String name;

private String cpf;

private int idade;


    public UUID getId() {return id;}

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
