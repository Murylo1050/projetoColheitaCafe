package com.example.projetoorientacaoobjetos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Cadastro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
    }

    public void moveToCadastroGrupo(View view) {
        Intent in = new Intent(getApplicationContext(),CadastroGrupo.class);
        startActivity(in);
    }

    public void moveToCadastroPessoa(View view) {
        Intent inte = new Intent(getApplicationContext(),CadastroPessoaReal.class);
        startActivity(inte);
    }
}