package com.example.projetoorientacaoobjetos;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.projetoorientacaoobjetos.OBJETOS.Grupo;

import java.util.ArrayList;

public class CadastroGrupo extends AppCompatActivity {
    private static ArrayList<Grupo> grupos = new ArrayList<>();




    public static ArrayList<Grupo> getGrupos() {
        return grupos;
    }

    private EditText  nomeGrupo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_grupo);

        nomeGrupo = (EditText)findViewById(R.id.nomeGrupoCadastragrupo);



    }




    public void cadastraGrupo(View view) {
        grupos.add(new Grupo(nomeGrupo.getText().toString()));
        Toast.makeText(getApplicationContext(),"O grupo: "+ nomeGrupo.getText().toString()+" foi criado",Toast.LENGTH_SHORT).show();
        nomeGrupo.setText("");


    }
}