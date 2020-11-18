package com.example.dimostore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import uk.co.senab.photoview.PhotoViewAttacher;

public class DetallesActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView imageView;
    PhotoViewAttacher photoViewAttacher;

    private androidx.cardview.widget.CardView detalle1;
    private androidx.cardview.widget.CardView detalle2;
    private androidx.cardview.widget.CardView detalle3;
    private androidx.cardview.widget.CardView detalle4;
    private androidx.cardview.widget.CardView detalle5;
    private androidx.cardview.widget.CardView detalle6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles);

        imageView = (ImageView) findViewById(R.id.imagen19);
        photoViewAttacher = new PhotoViewAttacher(imageView);

        imageView = (ImageView) findViewById(R.id.imagen14);
        photoViewAttacher = new PhotoViewAttacher(imageView);

        imageView = (ImageView) findViewById(R.id.imagen24);
        photoViewAttacher = new PhotoViewAttacher(imageView);

        imageView = (ImageView) findViewById(R.id.imagen23);
        photoViewAttacher = new PhotoViewAttacher(imageView);

        imageView = (ImageView) findViewById(R.id.imagen21);
        photoViewAttacher = new PhotoViewAttacher(imageView);

        imageView = (ImageView) findViewById(R.id.imagen17);
        photoViewAttacher = new PhotoViewAttacher(imageView);

        detalle1 = findViewById(R.id.detalle1);
        detalle2 = findViewById(R.id.detalle2);
        detalle3 = findViewById(R.id.detalle3);
        detalle4 = findViewById(R.id.detalle4);
        detalle5 = findViewById(R.id.detalle5);
        detalle6 = findViewById(R.id.detalle6);

        detalle1.setOnClickListener(this);
        detalle2.setOnClickListener(this);
        detalle3.setOnClickListener(this);
        detalle4.setOnClickListener(this);
        detalle5.setOnClickListener(this);
        detalle6.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.detalle1:
                startActivity(new Intent(getApplicationContext(), TarjetaDetalles1Activity.class));
                break;

            case R.id.detalle2:
                startActivity(new Intent(getApplicationContext(), TarjetaDetalles2Activity.class));
                break;

            case R.id.detalle3:
                startActivity(new Intent(getApplicationContext(), TarjetaDetalles3Activity.class));
                break;

            case R.id.detalle4:
                startActivity(new Intent(getApplicationContext(), TarjetaDetalles4Activity.class));
                break;

            case R.id.detalle5:
                startActivity(new Intent(getApplicationContext(), TarjetaDetalles5Activity.class));
                break;

            case R.id.detalle6:
                startActivity(new Intent(getApplicationContext(), TarjetaDetalles6Activity.class));
                break;
        }
    }
}