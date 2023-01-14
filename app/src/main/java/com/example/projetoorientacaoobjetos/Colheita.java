package com.example.projetoorientacaoobjetos;

import static com.example.projetoorientacaoobjetos.CadastroGrupo.getGrupos;
import static com.example.projetoorientacaoobjetos.CadastroPessoaReal.getPessoas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.projetoorientacaoobjetos.OBJETOS.Grupo;
import com.example.projetoorientacaoobjetos.OBJETOS.Pessoa;

import java.util.ArrayList;

public class Colheita extends AppCompatActivity {
    private Spinner listaGrupo;
    private EditText idPessoa;
    String[] equipes;

    private ArrayList<String> equipe = new ArrayList<>();
    private ArrayList<Grupo> grupos = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colheita);
        listaGrupo = (Spinner) findViewById(R.id.spinnerColheitaGrupo);
        idPessoa = (EditText)findViewById(R.id.et_nome_pessoa_colheita);


        grupos.addAll(getGrupos());

        for (Grupo grupo: grupos) {
            equipe.add(grupo.getNomeGrupo());
        }

        equipes = equipe.toArray(new String[0]);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, equipes);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        listaGrupo.setAdapter(arrayAdapter);


        listaGrupo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                String value=adapterView.getItemAtPosition(position).toString();

            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }
    private int cont=0;
    public void AdicionaNovosSacos(View view) {
        while(!(grupos.get(listaGrupo.getSelectedItemPosition()).getPessoasDaEquipe().get(cont).getId() == Integer.parseInt(idPessoa.getText());
    }
}