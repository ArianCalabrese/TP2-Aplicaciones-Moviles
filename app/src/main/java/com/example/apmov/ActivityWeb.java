package com.example.apmov;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityWeb extends AppCompatActivity {
Button botonConsejos, botonComprar, botonInformacion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        botonConsejos = (Button)findViewById(R.id.buttonConsejos);
        botonComprar = (Button)findViewById(R.id.buttonMercaLibre);
        botonInformacion = (Button)findViewById(R.id.buttonMasAutos);

        botonConsejos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityWeb.this, WebActivityMain.class);
                intent.putExtra("boton", "consejos");
                startActivity(intent);
            }
        });

        botonComprar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityWeb.this, WebActivityMain.class);
                intent.putExtra("boton", "comprar");
                startActivity(intent);
            }
        });

        botonInformacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityWeb.this, WebActivityMain.class);
                intent.putExtra("boton", "informacion");
                startActivity(intent);
            }
        });

    }



}
