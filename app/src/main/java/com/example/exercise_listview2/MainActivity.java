package com.example.exercise_listview2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listViewItems;
    private Adaptador adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewItems = findViewById(R.id.listView);
        adaptador = new Adaptador(getArrayItems(), this);
        listViewItems.setAdapter(adaptador);


    }

    private ArrayList<Entidad> getArrayItems(){

        ArrayList<Entidad> listaItems = new ArrayList<>();
        listaItems.add(new Entidad(R.drawable.ic_baseline_done_24,"Picante"));
        listaItems.add(new Entidad(R.drawable.ic_baseline_done_24,"Ketchup"));
        listaItems.add(new Entidad(R.drawable.ic_baseline_done_24,"Mayonesa"));
        listaItems.add(new Entidad(R.drawable.ic_baseline_done_24,"Mostaza"));
        listaItems.add(new Entidad(R.drawable.ic_baseline_done_24,"Barbacoa"));
        listaItems.add(new Entidad(R.drawable.ic_baseline_done_24,"Curry"));
        listaItems.add(new Entidad(R.drawable.ic_baseline_done_24,"Agridulce"));
        listaItems.add(new Entidad(R.drawable.ic_baseline_done_24,"Rosa"));
        listaItems.add(new Entidad(R.drawable.ic_baseline_done_24,"Soja"));
        listaItems.add(new Entidad(R.drawable.ic_baseline_done_24,"Finas hierbas"));
        listaItems.add(new Entidad(R.drawable.ic_baseline_done_24,"Queso"));
        listaItems.add(new Entidad(R.drawable.ic_baseline_done_24,"Mermelada"));
        listaItems.add(new Entidad(R.drawable.ic_baseline_done_24,"Sirope"));
        listaItems.add(new Entidad(R.drawable.ic_baseline_done_24,"Crema"));

        return listaItems;

    }


}