package com.example.demo;

public class Usuario {
    private String nome;

    private String acesso;

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setAcesso(String acesso){
        this.acesso = acesso;
    }

    public String getNome(){
        return this.nome;
    }

    public String getAcesso(){
        return this.acesso;
    }
}