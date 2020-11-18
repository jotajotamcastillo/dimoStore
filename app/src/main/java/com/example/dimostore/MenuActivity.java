package com.example.dimostore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private ImageButton btn7;
    private ImageButton btn8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        btn1 = findViewById(R.id.btnproductos);
        btn2 = findViewById(R.id.btnarticulos);
        btn3 = findViewById(R.id.btngaleria);
        btn4 = findViewById(R.id.btnempresa);
        btn5 = findViewById(R.id.btnmapa);
        btn6 = findViewById(R.id.btnpedido);
        btn7 = findViewById(R.id.btnFacebook);
        btn8 = findViewById(R.id.btnWhatsapp);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.btnproductos:
                startActivity(new Intent(getApplicationContext(), DetallesActivity.class));
                break;

            case R.id.btnarticulos:
                startActivity(new Intent(getApplicationContext(), CanastasActivity.class));
                break;

            case R.id.btngaleria:
                startActivity(new Intent(getApplicationContext(),GaleriaActivity.class));
                break;

            case R.id.btnempresa:
                startActivity(new Intent(getApplicationContext(),EmpresaActivity.class));
                break;

            case R.id.btnpedido:

            case R.id.btnWhatsapp:
                String toNumber = "57"+"3102879246";
                Intent sendIntent = new Intent("android.intent.action.MAIN");
                sendIntent.setComponent(new ComponentName("com.whatsapp","com.whatsapp.Conversation"));
                sendIntent.putExtra("jid", PhoneNumberUtils.stripSeparators(toNumber)+"@s.whatsapp.net");
                startActivity(sendIntent);
                break;

            case R.id.btnmapa:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/7oMuxuMAzRykYYYB7")));
                break;

            case R.id.btnFacebook:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/DIMO.MOMENTOS.INOLVIDABLES")));
                break;
        }
    }
}