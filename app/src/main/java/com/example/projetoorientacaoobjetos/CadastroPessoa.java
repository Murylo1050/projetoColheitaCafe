package com.example.projetoorientacaoobjetos;

import static com.example.projetoorientacaoobjetos.CadastroGrupo.getGrupos;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.projetoorientacaoobjetos.OBJETOS.Grupo;

public class CadastroPessoa extends AppCompatActivity {
    Spinner lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_pessoa2);
        lista = (Spinner) findViewById(R.id.spinnerCadastraPessoa);

        ArrayAdapter<Grupo> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, getGrupos());
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        lista.setAdapter(arrayAdapter);

        lista.setOnItemClickListener((adapterView, view, position, id) -> {
            String value = adapterView.getItemAtPosition(position).toString();
            Toast.makeText(CadastroPessoa.this,value,Toast.LENGTH_SHORT).show();
        });


    }


    public void cadastraPessoa(View view) {

    }
}