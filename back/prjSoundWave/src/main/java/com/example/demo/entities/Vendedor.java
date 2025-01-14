package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Vendedor") // Tabela agora se chama "Vendedor"
public class Vendedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_vendedor; // Renomeado para id_vendedor
    private String nome;
    private String email;
    private String senha;

    // Construtores
    public Vendedor() {
    }

    public Vendedor(Long id_vendedor, String nome, String email, String senha) {
        super();
        this.id_vendedor = id_vendedor;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    // Getters
    public Long getId_vendedor() {
        return id_vendedor;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    // Setters
    public void setId_vendedor(Long id_vendedor) {
        this.id_vendedor = id_vendedor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
