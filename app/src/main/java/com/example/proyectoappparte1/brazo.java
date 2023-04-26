package com.example.proyectoappparte1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class brazo extends AppCompatActivity {
    private TextView tv_nombre2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brazo);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launchermamado);
        tv_nombre2 = (TextView) findViewById(R.id.tv_nombre2);
        int idImagen2 = getIntent().getIntExtra("avatar", -1);
        if (idImagen2 != -1) {
            ImageView imageView = findViewById(R.id.iv_pasar2);
            imageView.setImageResource(idImagen2);
        }
        String dato2 = getIntent().getStringExtra("dato");
        tv_nombre2.setText(dato2);
    }
    public void brazo1 (View view) {
        Intent i = new Intent(this, VerBrazo.class);
        i.putExtra("gif_seleccionado", "curlbueno");
        startActivity(i);


    }
    public void brazo2 (View view) {
        Intent i = new Intent(this, VerBrazo.class);
        i.putExtra("gif_seleccionado", "concentrado");
        startActivity(i);


    }
    public void brazo3 (View view) {
        Intent i = new Intent(this, VerBrazo.class);
        i.putExtra("gif_seleccionado", "martillo");
        startActivity(i);


    }
    public void brazo4 (View view) {
        Intent i = new Intent(this, VerBrazo.class);
        i.putExtra("gif_seleccionado", "tricepsunbrazo");
        startActivity(i);


    }
    public void brazo5 (View view) {
        Intent i = new Intent(this, VerBrazo.class);
        i.putExtra("gif_seleccionado", "tricepsnopolea");
        startActivity(i);


    }
    public void brazo6 (View view) {
        Intent i = new Intent(this, VerBrazo.class);
        i.putExtra("gif_seleccionado", "antebrazo");
        startActivity(i);


    }
}