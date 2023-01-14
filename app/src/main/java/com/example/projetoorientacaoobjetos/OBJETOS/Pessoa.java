package com.example.projetoorientacaoobjetos.OBJETOS;

public class Pessoa {

    public Pessoa(String nome, Grupo grupo){
        this.nome = nome;
        this.grupo = grupo;
    }

    private String nome;
    private Grupo grupo;

    public String getNome() { return nome; }
}
