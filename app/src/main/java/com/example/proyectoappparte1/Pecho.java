package com.example.proyectoappparte1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Pecho extends AppCompatActivity {
    private TextView tv_nombre2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pecho);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launchermamado);

    }
    public void pecho1 (View view) {
        Intent i = new Intent(this, VerBrazo.class);
        i.putExtra("gif_seleccionado", "banca");
        startActivity(i);


    }
    public void pecho2 (View view) {
        Intent i = new Intent(this, VerBrazo.class);
        i.putExtra("gif_seleccionado", "press_horizontal_mancuernas");
        startActivity(i);


    }
    public void pecho3 (View view) {
        Intent i = new Intent(this, VerBrazo.class);
        i.putExtra("gif_seleccionado", "press_militar");
        startActivity(i);


    }
    public void pecho4 (View view) {
        Intent i = new Intent(this, VerBrazo.class);
        i.putExtra("gif_seleccionado", "laterales");
        startActivity(i);


    }
    public void pecho5 (View view) {
        Intent i = new Intent(this, VerBrazo.class);
        i.putExtra("gif_seleccionado", "tricepsnopolea");
        startActivity(i);


    }
    public void pecho6 (View view) {
        Intent i = new Intent(this, VerBrazo.class);
        i.putExtra("gif_seleccionado", "fondos");
        startActivity(i);


    }
}