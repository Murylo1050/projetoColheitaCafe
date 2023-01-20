package com.example.projetoorientacaoobjetos.OBJETOS;

import java.util.ArrayList;

public class Grupo {

    public Grupo(String nome){
        this.nome = nome;

    }
    private String nome;
    private ArrayList<Pessoa> pessoasDaEquipe = new ArrayList<>();

    public ArrayList<Pessoa> getPessoasDaEquipe() {
        return pessoasDaEquipe;
    }


    public void setPessoasDaEquipe(Pessoa pessoasDoTime) {
        pessoasDaEquipe.add(pessoasDoTime);
    }

    public String getNomeGrupo() {
        return nome;
    }
}
