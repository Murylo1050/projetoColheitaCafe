package com.example.projetoorientacaoobjetos;

import static com.example.projetoorientacaoobjetos.CadastroGrupo.getGrupos;

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

public class CadastroPessoaReal extends AppCompatActivity {
    private Spinner lista;
    private static ArrayList<Pessoa> pessoas = new ArrayList<>();
    private EditText nomePessoa;

    private ArrayList<String> equipe = new ArrayList<>();
    private ArrayList<Grupo> grupos = new ArrayList<>();


    public static ArrayList<Pessoa> getPessoas() { return pessoas; }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_pessoa_real);
        lista = (Spinner) findViewById(R.id.spinnerDoCadastraPessoa);
        nomePessoa = (EditText)findViewById(R.id.et_nome_pessoa);

        grupos.addAll(getGrupos());
        for (Grupo grupo: grupos) {
            equipe.add(grupo.getNomeGrupo());
        }

        String[] equipes = equipe.toArray(new String[0]);

       



        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, equipes);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        lista.setAdapter(arrayAdapter);

        lista.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                String value=adapterView.getItemAtPosition(position).toString();


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }

        });



    }


    public void cadastraPessoa(View view) {
        Pessoa pessoa = new Pessoa(nomePessoa.getText().toString(),grupos.get(lista.getSelectedItemPosition()));
        pessoas.add(pessoa);
        grupos.get(lista.getSelectedItemPosition()).setPessoasDaEquipe(pessoa);
        Toast.makeText(getApplicationContext(),"A pessoa: "+ nomePessoa.getText().toString()+" registrada",Toast.LENGTH_SHORT).show();
        nomePessoa.setText(" ");



    }
}