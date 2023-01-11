package com.example.projetoorientacaoobjetos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void moveToCadastro(View view) {
        Intent in = new Intent(this,Cadastro.class);
        startActivity(in);
    }

    public void moveToColheita(View view) {
        Intent in = new Intent(this,Colheita.class);
        startActivity(in);
    }
}
//teste
