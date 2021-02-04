package com.example.recycleviewapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.recycleviewapp.model.Pessoa;
import com.example.recycleviewapp.model.PessoaFisica;
import com.example.recycleviewapp.model.PessoaJuridica;

import java.util.List;

public class ListaPessoasAdapter extends
        RecyclerView.Adapter<ListaPessoasAdapter.ListaPessoasViewHolder> {

    public ListaPessoasAdapter(List<Pessoa> listaPessoas) {
        this.listaPessoas = listaPessoas;
    }
    List<Pessoa> listaPessoas;

    @NonNull
    @Override
    public ListaPessoasViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemview = LayoutInflater.
                from(parent.getContext())
                .inflate(R.layout.layout_lista_pessoas, parent,
                        false);
        return new ListaPessoasViewHolder(itemview);
    }

    @Override
    public void onBindViewHolder(@NonNull ListaPessoasViewHolder holder, int position) {

        if (this.listaPessoas.get(position).getTipoDocumento().equals("F")) {
            PessoaFisica pf = (PessoaFisica) this.listaPessoas.get(position);
            holder.txvItem.setText(pf.getNome());
        }
        else{
            PessoaJuridica pj = (PessoaJuridica) this.listaPessoas.get(position);
            holder.txvItem.setText(pj.getRazaosocial());
        }

        }

    @Override
    public int getItemCount() {
        return (listaPessoas !=null && listaPessoas.size() > 0)?
                listaPessoas.size() : 0;
    }

    static class ListaPessoasViewHolder extends RecyclerView.ViewHolder{

        TextView txvItem;
        ImageButton imgAdd;
        ImageButton imgDel;
        ImageButton imgEdit;

        public ListaPessoasViewHolder(View itemView){
            super(itemView);
            txvItem = itemView.findViewById(R.id.txvItemLista);
            imgAdd = itemView.findViewById(R.id.imgAdd);
            imgDel = itemView.findViewById(R.id.imgDel);
            imgEdit = itemView.findViewById(R.id.imgEdit);
        }
    }
}
