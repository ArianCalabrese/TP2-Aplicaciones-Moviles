package com.example.apmov;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedList;

public class CarList extends AppCompatActivity {
    RecyclerView recyclerView;
    Adapter adapter;

    ArrayList<String> f1 = new ArrayList<>(); //MARCA
    ArrayList<String> f2 = new ArrayList<>(); //MODELO
    ArrayList<String> f3 = new ArrayList<>(); //ANIO
    ArrayList<String> f4 = new ArrayList<>(); //CABALLOS
    ArrayList<Integer> images = new ArrayList<>();
    FileManager fileManager = new FileManager(); //NUEVO
    LinkedList<Auto> autos = new LinkedList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_list);

        InputStream file = null;
        try {
            file = getAssets().open("Prueba.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        autos = fileManager.retornarAutos(file,this);

        if (getIntent().getStringExtra("boton").equals("todos")){
        for (Auto auto : autos) {
            f1.add(auto.getMarca());
            f2.add(auto.getModelo());
            f3.add(auto.getAnio());
            f4.add(auto.getCaballos());
            images.add(auto.getImagen());
        }
        }
        if (getIntent().getStringExtra("boton").equals("alta")){
            for (Auto auto : autos) {
                if (Integer.parseInt(auto.getCaballos())>=250) {
                    f1.add(auto.getMarca());
                    f2.add(auto.getModelo());
                    f3.add(auto.getAnio());
                    f4.add(auto.getCaballos());
                    images.add(auto.getImagen());
                }
            }
        }

        if (getIntent().getStringExtra("boton").equals("media")){
            for (Auto auto : autos) {
                if (Integer.parseInt(auto.getCaballos())<250 && Integer.parseInt(auto.getCaballos())>=180) {
                    f1.add(auto.getMarca());
                    f2.add(auto.getModelo());
                    f3.add(auto.getAnio());
                    f4.add(auto.getCaballos());
                    images.add(auto.getImagen());
                }
            }
        }

        if (getIntent().getStringExtra("boton").equals("baja")){
            for (Auto auto : autos) {
                if (Integer.parseInt(auto.getCaballos())<180 && Integer.parseInt(auto.getCaballos())>=0) {
                    f1.add(auto.getMarca());
                    f2.add(auto.getModelo());
                    f3.add(auto.getAnio());
                    f4.add(auto.getCaballos());
                    images.add(auto.getImagen());
                }
            }
        }
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new Adapter(this, f1, f2, f3, f4, images);
        recyclerView.setAdapter(adapter);
    }
}
