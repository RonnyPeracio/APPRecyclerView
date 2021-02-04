package com.example.recycleviewapp.model;

import android.content.Context;

import java.util.Date;
import java.util.List;

public class PessoaJuridica extends Pessoa {

    private String razaosocial;
    private Date dtAbertura;

    public String getRazaosocial() {
        return razaosocial;
    }
    public void setRazaosocial(String razaosocial) {
        this.razaosocial = razaosocial;
    }
    public Date getDtAbertura() {
        return dtAbertura;
    }
    public void setDtAbertura(Date dtAbertura) {
        this.dtAbertura = dtAbertura;
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
