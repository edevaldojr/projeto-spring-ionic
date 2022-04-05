package com.edevaldojr.cursomc.dto;

import java.io.Serializable;

import com.edevaldojr.cursomc.domain.Cidade;

public class CidadeDTO implements Serializable {

    private Integer id;
    private String nome;

    public CidadeDTO(Cidade obj) {
        this.id = obj.getId();
        this.nome = obj.getNome();
    }

    public CidadeDTO() {

    }

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
