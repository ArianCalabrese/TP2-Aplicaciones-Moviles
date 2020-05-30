package com.example.apmov;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class JerarquiaActivity extends AppCompatActivity {
private Button alta, media, baja;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jerarquia);

        alta = (Button)findViewById(R.id.altaButton);
        media = (Button)findViewById(R.id.mediaButton);
        baja = (Button)findViewById(R.id.bajaButton);

        alta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JerarquiaActivity.this, CarList.class);
                intent.putExtra("boton","alta");
                startActivity(intent);
            }
        });
        media.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JerarquiaActivity.this, CarList.class);
                intent.putExtra("boton","media");
                startActivity(intent);
            }
        });
        baja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JerarquiaActivity.this, CarList.class);
                intent.putExtra("boton","baja");
                startActivity(intent);
            }
        });
    }
}
