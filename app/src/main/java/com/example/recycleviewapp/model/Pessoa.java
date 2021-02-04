package com.example.recycleviewapp.model;

import android.content.Context;

import java.util.Date;
import java.util.List;

public abstract class Pessoa {
    private int id;
    private String tipoDocumento;
    private String documento;
    private String tipoTelefone;
    private String telefone;
    private Date dtAceite;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTipoTelefone() {
        return tipoTelefone;
    }

    public void setTipoTelefone(String tipoTelefone) {
        this.tipoTelefone = tipoTelefone;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Date getDtAceite() {
        return dtAceite;
    }

    public void setDtAceite(Date dtAceite) {
        this.dtAceite = dtAceite;
    }

    public abstract long Cadastrar (Context atividade);
    public abstract List<Pessoa> Listar(Context atividade);

}
