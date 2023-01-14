package com.example.projetoorientacaoobjetos;

import static com.example.projetoorientacaoobjetos.CadastroGrupo.getGrupos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.projetoorientacaoobjetos.OBJETOS.Grupo;

import java.util.ArrayList;

public class Colheita extends AppCompatActivity {
    private Spinner lista;
    private ArrayList<String> equipe = new ArrayList<>();
    private ArrayList<Grupo> grupos = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colheita);
        lista = (Spinner) findViewById(R.id.spinnerColheita);

        grupos.addAll(getGrupos());

        System.out.println("Ola mundo");
        //System.out.println(getGrupos().get(1).getNome());


        for (Grupo grupo: grupos) {
            //System.out.println(grupo.getNome());
            equipe.add(grupo.getNome());
        }

        String[] equipes = equipe.toArray(new String[0]);

        for (String sexo: equipes) {
            System.out.println(sexo);
        }



        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, equipes);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        lista.setAdapter(arrayAdapter);

        lista.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                String value=adapterView.getItemAtPosition(position).toString();
                Toast.makeText( Colheita.this, equipes[position],Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    public void AdicionaNovosSacos(View view) {
    }
}