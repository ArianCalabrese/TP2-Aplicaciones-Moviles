package com.example.apmov;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    ImageView mainImageView;
    TextView title, modelo, anio, caballos;
    String data1, data2, data3, data4;
    int myImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mainImageView = findViewById(R.id.mainImageView);
        title = findViewById(R.id.marcaText);
        modelo = findViewById(R.id.modeloText);
        anio = findViewById(R.id.anioText);
        caballos = findViewById(R.id.caballosText);

        getData();
        setData();
    }
    private void getData(){
        if (getIntent().hasExtra("myImage") && getIntent().hasExtra("data1") && getIntent().hasExtra("data2")){
            data1 = title.getText() + getIntent().getStringExtra("data1");
            data2 = modelo.getText() + getIntent().getStringExtra("data2");
            data3 = anio.getText() + getIntent().getStringExtra("data3");
            data4 = caballos.getText() + getIntent().getStringExtra("data4");
            myImage = getIntent().getIntExtra("myImage",1);
        }else{
            Toast.makeText(this,"no data",Toast.LENGTH_SHORT).show();
        }
    }

    private void setData(){
        title.setText(data1);
        modelo.setText(data2);
        anio.setText(data3);
        caballos.setText(data4);
        mainImageView.setImageResource(myImage);
    }
}
