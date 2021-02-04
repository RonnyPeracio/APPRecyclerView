package com.example.recycleviewapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recycleviewapp.model.Pessoa;
import com.example.recycleviewapp.model.PessoaFisica;
import com.example.recycleviewapp.model.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;

public class ListaPessoasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_pessoas);

        RecyclerView rcvLista = findViewById(R.id.rcvListaPessoas);
        RecyclerView.LayoutManager layoutManager =
                new LinearLayoutManager(
                        ListaPessoasActivity.this);
        rcvLista.setLayoutManager(layoutManager);
        rcvLista.setAdapter(new ListaPessoasAdapter(listarPessoas()));

    }

    public List<Pessoa> listarPessoas(){

        List<Pessoa> listapessoas = new ArrayList<>();

        PessoaFisica p = new PessoaFisica();
        p.setNome("Fulano");
        p.setTipoDocumento("F");

        PessoaFisica p1 = new PessoaFisica();
        p1.setNome("Cicrano");
        p1.setTipoDocumento("F");

        PessoaJuridica p2 = new PessoaJuridica();
        p2.setRazaosocial("JPR");
        p2.setTipoDocumento("J");

        PessoaJuridica p3 = new PessoaJuridica();
        p3.setRazaosocial("Vila dos Chefs");
        p3.setTipoDocumento("J");

        listapessoas.add(p);
        listapessoas.add(p1);
        listapessoas.add(p2);
        listapessoas.add(p3);

        return listapessoas;
    }
}
