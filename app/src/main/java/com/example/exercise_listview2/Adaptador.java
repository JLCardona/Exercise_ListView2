package com.example.exercise_listview2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

public class Adaptador extends BaseAdapter {

    private ArrayList<Entidad> listaItems;
    private Context contexto;

    public Adaptador(ArrayList<Entidad> listaItems, Context contexto) {
        this.listaItems = listaItems;
        this.contexto = contexto;
    }

    @Override
    public int getCount() {
        return listaItems.size();
    }

    @Override
    public Object getItem(int i) {
        return listaItems.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        Entidad item = (Entidad) getItem(i);

        view = LayoutInflater.from(contexto).inflate(R.layout.item, null);
        RatingBar imagen = (RatingBar) view.findViewById(R.id.img);
        TextView texto = (TextView) view.findViewById(R.id.text);

        //imagen.setImageResource(item.getImagen());
        texto.setText(item.getTexto());

        return view;
    }
}
