package com.example.apmov;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton carListButton, motoresListButton, webViewPaginas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        carListButton = (ImageButton) findViewById(R.id.imageButton);
        motoresListButton = (ImageButton) findViewById(R.id.imageButton2);
        webViewPaginas = (ImageButton) findViewById(R.id.imageButton3);

        carListButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CarList.class);
                intent.putExtra("boton","todos");
                startActivity(intent);
            }
        });

        motoresListButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, JerarquiaActivity.class);
                startActivity(intent);
            }
        });

        webViewPaginas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityWeb.class);
                startActivity(intent);
            }
        });

    }
}
