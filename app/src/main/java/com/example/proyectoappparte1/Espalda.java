package com.example.proyectoappparte1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Espalda extends AppCompatActivity {
    private EditText tv_nombre4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_espalda);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launchermamado);
        ImageView imageView = findViewById(R.id.iv_pasar4);
        TextView tv_nombre4 = findViewById(R.id.tv_nombre4);
        Aplicacion aplicacion = (Aplicacion) getApplication();
        int imagenSeleccionada = aplicacion.getImagenSeleccionada();
        imageView.setImageResource(imagenSeleccionada);
        String nombreUsuario = aplicacion.getNombreUsuario();
        tv_nombre4.setText(nombreUsuario);

    }
    public void espalda1 (View view) {
        Intent i = new Intent(this, tiempo.class);
        i.putExtra("gif_seleccionado", "dors2");
        i.putExtra("series", "Realiza 3 series de este ejercicio");
        startActivity(i);


    }
    public void espalda2 (View view) {
        Intent i = new Intent(this, tiempo.class);
        i.putExtra("gif_seleccionado", "dor6");
        i.putExtra("series", "Realiza 3 series de este ejercicio");
        startActivity(i);


    }
    public void espalda3 (View view) {
        Intent i = new Intent(this, tiempo.class);
        i.putExtra("gif_seleccionado", "dominadas");
        i.putExtra("series", "Realiza 2 series de este ejercicio");
        startActivity(i);


    }
    public void espalda4 (View view) {
        Intent i = new Intent(this, tiempo.class);
        i.putExtra("gif_seleccionado", "alterno");
        i.putExtra("series", "Realiza 3 series de este ejercicio");

        startActivity(i);


    }
    public void espalda5 (View view) {
        Intent i = new Intent(this, tiempo.class);
        i.putExtra("gif_seleccionado", "scott");
        i.putExtra("series", "Realiza 4 series de este ejercicio");
        startActivity(i);


    }

}