package com.example.proyectoappparte1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Espalda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_espalda);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launchermamado);

    }
    public void espalda1 (View view) {
        Intent i = new Intent(this, VerBrazo.class);
        i.putExtra("gif_seleccionado", "dors2");
        startActivity(i);


    }
    public void espalda2 (View view) {
        Intent i = new Intent(this, VerBrazo.class);
        i.putExtra("gif_seleccionado", "dor6");
        startActivity(i);


    }
    public void espalda3 (View view) {
        Intent i = new Intent(this, VerBrazo.class);
        i.putExtra("gif_seleccionado", "dominadas");
        startActivity(i);


    }
    public void espalda4 (View view) {
        Intent i = new Intent(this, VerBrazo.class);
        i.putExtra("gif_seleccionado", "alterno");
        startActivity(i);


    }
    public void espalda5 (View view) {
        Intent i = new Intent(this, VerBrazo.class);
        i.putExtra("gif_seleccionado", "scott");
        startActivity(i);


    }

}