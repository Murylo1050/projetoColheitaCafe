package com.example.projetoorientacaoobjetos.OBJETOS;

public class Pessoa {
    private int contId = 0;

    public Pessoa(String nome, Grupo grupo){
        contId+=1;
        this.nome = nome;
        this.grupo = grupo;
        this.id = contId;
        this.qtdSacos=0;
    }

    private String nome;
    private Grupo grupo;
    private int id;
    private int qtdSacos;

    public int getQtdSacos() {
        return qtdSacos;
    }

    public void setQtdSacos(int qtdSacos) {
        this.qtdSacos = qtdSacos;
    }

    public int getId() { return id; }

    public Grupo getGrupo() { return grupo; }

    public String getNomePessoa() { return nome; }
}
