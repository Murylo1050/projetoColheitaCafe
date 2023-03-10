package com.example.projetoorientacaoobjetos;

import static com.example.projetoorientacaoobjetos.CadastroGrupo.getGrupos;
import static com.example.projetoorientacaoobjetos.CadastroPessoaReal.getPessoas;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.projetoorientacaoobjetos.OBJETOS.Grupo;
import com.example.projetoorientacaoobjetos.OBJETOS.Pessoa;

import java.util.ArrayList;

public class Colheita extends AppCompatActivity {
    private Spinner listaGrupo;
    private EditText nomePessoa;
    private EditText qtdSacos;
    private Button btAtualizarSacos;
    String[] equipes;

    private ArrayList<String> equipe = new ArrayList<>();
    private ArrayList<Grupo> grupos = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colheita);
        listaGrupo = (Spinner) findViewById(R.id.spinnerColheitaGrupo);
        nomePessoa = (EditText)findViewById(R.id.et_nome_pessoa_colheita);
        qtdSacos = (EditText)findViewById(R.id.et_qtd_sacos);
        btAtualizarSacos = (Button)findViewById(R.id.btFinalizarColheita);


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

        nomePessoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            nomePessoa.setText("");
            }
        });


        try {
            btAtualizarSacos.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int cont = 0;
                    while (!(grupos.get(listaGrupo.getSelectedItemPosition()).getPessoasDaEquipe().get(cont).getNomePessoa().equalsIgnoreCase(nomePessoa.getText().toString()))) {
                        cont++;
                    }

                    grupos.get(listaGrupo.getSelectedItemPosition()).getPessoasDaEquipe().get(cont).addSacos(Integer.parseInt(qtdSacos.getText().toString()));
                    Toast.makeText(getApplicationContext(),"Sacos coletados com sucesso!",Toast.LENGTH_SHORT).show();
                    nomePessoa.setText("");
                    qtdSacos.setText("");

                }
            });
        }catch (Exception e){
            AlertDialog.Builder alert = new AlertDialog.Builder(getApplicationContext());
            alert.setTitle("Aten????o !");
            alert.setMessage("A pessoa digitada n??o pertence a esse grupo ou n??o existe!");
            alert.create().show();
            nomePessoa.setText("");

        }
    }



/*
    public void AdicionaNovosSacos(View view) {
        int cont = 0;
        try {


            while (!(grupos.get(listaGrupo.getSelectedItemPosition()).getPessoasDaEquipe().get(cont).getNomePessoa().equalsIgnoreCase(nomePessoa.getText().toString()))) {
                cont++;
            }

            grupos.get(listaGrupo.getSelectedItemPosition()).getPessoasDaEquipe().get(cont).addSacos(Integer.parseInt(qtdSacos.getText().toString()));
            Toast.makeText(getApplicationContext(),"Sacos coletados com sucesso!",Toast.LENGTH_SHORT).show();
            nomePessoa.setText("");
            qtdSacos.setText("");
        }catch (Exception e){
            AlertDialog.Builder alert = new AlertDialog.Builder(getApplicationContext());
            alert.setTitle("Aten????o !");
            alert.setMessage("A pessoa digitada n??o pertence a esse grupo ou n??o existe!");
            alert.create().show();
            nomePessoa.setText("");

        }


    }
*/


}