package br.senai.rn.agenda.view;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Lista de Alunos");

        List<String> alunos = new ArrayList<~>();

        alunos.add("Miguel");
        alunos.add("Ohana");
        alunos.add("Juliana");

        ListView ListaAlunos = (ListView) findViewById(R.id.activity_main_fab_novo_alunos);

        listaAlunos.setAdapter(new ArrayAdapter<String>(
                Context: this,
        android.R.layout.simple_list_item_i,
        alunos
        ));
    }
}
