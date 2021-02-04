package com.example.recycleviewapp.model;

import android.content.Context;

import java.util.Date;
import java.util.List;

public class PessoaFisica extends Pessoa {

    private String nome;
    private Date dtNascimento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    @Override
    public long Cadastrar(Context atividade) {
        return 0;
    }

    @Override
    public List<Pessoa> Listar(Context atividade) {
        return null;
    }
}
