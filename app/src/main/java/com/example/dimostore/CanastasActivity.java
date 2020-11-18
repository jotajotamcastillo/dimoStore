package com.example.dimostore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import uk.co.senab.photoview.PhotoViewAttacher;

public class CanastasActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView imageView;
    PhotoViewAttacher photoViewAttacher;

    private androidx.cardview.widget.CardView canasta1;
    private androidx.cardview.widget.CardView canasta2;
    private androidx.cardview.widget.CardView canasta3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canastas);

            imageView = (ImageView) findViewById(R.id.imagen01);
            photoViewAttacher = new PhotoViewAttacher(imageView);

            imageView = (ImageView) findViewById(R.id.imagen15);
            photoViewAttacher = new PhotoViewAttacher(imageView);

            imageView = (ImageView) findViewById(R.id.imagen16);
            photoViewAttacher = new PhotoViewAttacher(imageView);

        canasta1 = findViewById(R.id.canasta1);
        canasta2 = findViewById(R.id.canasta2);
        canasta3 = findViewById(R.id.canasta3);

        canasta1.setOnClickListener(this);
        canasta2.setOnClickListener(this);
        canasta3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.canasta1:
                startActivity(new Intent(getApplicationContext(), TarjetaCanasta1Activity.class));
                break;

            case R.id.canasta2:
                startActivity(new Intent(getApplicationContext(), TarjetaCanasta2Activity.class));
                break;

            case R.id.canasta3:
                startActivity(new Intent(getApplicationContext(), TarjetaCanasta3Activity.class));
                break;
        }
    }
}