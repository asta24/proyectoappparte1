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

        startActivity(i);


    }
}