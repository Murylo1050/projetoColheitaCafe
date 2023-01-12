package com.example.projetoorientacaoobjetos;

import static com.example.projetoorientacaoobjetos.CadastroGrupo.getGrupos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.projetoorientacaoobjetos.OBJETOS.Grupo;

import java.util.List;

public class CadastroPessoa extends AppCompatActivity {
    ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_pessoa2);
        lista = (ListView)findViewById(R.id.listViewCadastraPessoa);

        ArrayAdapter<Grupo> arrayAdapter = new ArrayAdapter<Grupo>(this, android.R.layout.simple_list_item_1,getGrupos());

        lista.setAdapter(arrayAdapter);
    }

    public void cadastraPessoa(View view) {

    }
}