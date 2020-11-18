package com.example.dimostore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class GaleriaActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView imagen0014;
    private ImageView imagen0019;
    private ImageView imagen0024;
    private ImageView imagen0023;
    private ImageView imagen0021;
    private ImageView imagen0017;
    private ImageView imagen0001;
    private ImageView imagen0005;
    private ImageView imagen0016;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeria);

        imagen0014 = findViewById(R.id.imagen0014);
        imagen0019 = findViewById(R.id.imagen0019);
        imagen0024 = findViewById(R.id.imagen0024);
        imagen0023 = findViewById(R.id.imagen0023);
        imagen0021 = findViewById(R.id.imagen0021);
        imagen0017 = findViewById(R.id.imagen0017);
        imagen0001 = findViewById(R.id.imagen0001);
        imagen0005 = findViewById(R.id.imagen0005);
        imagen0016 = findViewById(R.id.imagen0016);


        imagen0014.setOnClickListener(this);
        imagen0019.setOnClickListener(this);
        imagen0024.setOnClickListener(this);
        imagen0023.setOnClickListener(this);
        imagen0021.setOnClickListener(this);
        imagen0017.setOnClickListener(this);
        imagen0001.setOnClickListener(this);
        imagen0005.setOnClickListener(this);
        imagen0016.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.imagen0014:
                startActivity(new Intent(getApplicationContext(), TarjetaDetalles2Activity.class));
                break;
            case R.id.imagen0019:
                startActivity(new Intent(getApplicationContext(), TarjetaDetalles1Activity.class));
                break;
            case R.id.imagen0024:
                startActivity(new Intent(getApplicationContext(), TarjetaDetalles3Activity.class));
                break;
            case R.id.imagen0023:
                startActivity(new Intent(getApplicationContext(), TarjetaDetalles4Activity.class));
                break;
            case R.id.imagen0021:
                startActivity(new Intent(getApplicationContext(), TarjetaDetalles5Activity.class));
                break;
            case R.id.imagen0017:
                startActivity(new Intent(getApplicationContext(), TarjetaDetalles6Activity.class));
                break;
            case R.id.imagen0001:
                startActivity(new Intent(getApplicationContext(), TarjetaCanasta1Activity.class));
                break;
            case R.id.imagen0005:
                startActivity(new Intent(getApplicationContext(), TarjetaCanasta2Activity.class));
                break;
            case R.id.imagen0016:
                startActivity(new Intent(getApplicationContext(), TarjetaCanasta3Activity.class));
                break;

        }
    }
}