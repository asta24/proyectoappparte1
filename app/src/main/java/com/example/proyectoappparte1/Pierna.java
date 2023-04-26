package com.example.proyectoappparte1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Pierna extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pierna);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launchermamado);

    }
    public void pierna1 (View view) {
        Intent i = new Intent(this, VerBrazo.class);
        i.putExtra("gif_seleccionado", "sentadilla");
        startActivity(i);


    }
    public void pierna2 (View view) {
        Intent i = new Intent(this, VerBrazo.class);
        i.putExtra("gif_seleccionado", "bulgara");
        startActivity(i);


    }
    public void pierna3 (View view) {
        Intent i = new Intent(this, VerBrazo.class);
        i.putExtra("gif_seleccionado", "femoral");
        startActivity(i);


    }
    public void pierna4 (View view) {
        Intent i = new Intent(this, VerBrazo.class);
        i.putExtra("gif_seleccionado", "sentado");
        startActivity(i);


    }
    public void pierna5 (View view) {
        Intent i = new Intent(this, VerBrazo.class);
        i.putExtra("gif_seleccionado", "piernaestendida");
        startActivity(i);


    }
    public void pierna6 (View view) {
        Intent i = new Intent(this, VerBrazo.class);
        i.putExtra("gif_seleccionado", "abdomen");
        startActivity(i);


    }

}