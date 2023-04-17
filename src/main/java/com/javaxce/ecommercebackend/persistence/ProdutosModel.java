package com.javaxce.ecommercebackend.persistence;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ProdutosModel {

    @Id
    private Integer id;
    private String nome;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
