package com.example.proyectoappparte1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Pierna extends AppCompatActivity {
    private EditText tv_nombre5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pierna);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launchermamado);
        ImageView imageView = findViewById(R.id.iv_pasar5);
        TextView tv_nombre5 = findViewById(R.id.tv_nombre5);
        Aplicacion aplicacion = (Aplicacion) getApplication();
        int imagenSeleccionada = aplicacion.getImagenSeleccionada();
        imageView.setImageResource(imagenSeleccionada);
        String nombreUsuario = aplicacion.getNombreUsuario();
        tv_nombre5.setText(nombreUsuario);
    }
    public void pierna1 (View view) {
        Intent i = new Intent(this, MainActivityTemporizador.class);
        //i.putExtra("gif_seleccionado", "sentadilla");
        startActivity(i);


    }
    public void pierna2 (View view) {
        Intent i = new Intent(this, MainActivityTemporizador.class);
        i.putExtra("gif_seleccionado", "bulgara");
        startActivity(i);


    }
    public void pierna3 (View view) {
        Intent i = new Intent(this, MainActivityTemporizador.class);
        i.putExtra("gif_seleccionado", "femoral");
        startActivity(i);


    }
    public void pierna4 (View view) {
        Intent i = new Intent(this, MainActivityTemporizador.class);
        i.putExtra("gif_seleccionado", "sentado");
        startActivity(i);


    }
    public void pierna5 (View view) {
        Intent i = new Intent(this, MainActivityTemporizador.class);
        i.putExtra("gif_seleccionado", "piernaestendida");
        startActivity(i);


    }
    public void pierna6 (View view) {
        Intent i = new Intent(this, MainActivityTemporizador.class);
        i.putExtra("gif_seleccionado", "abdomen");
        startActivity(i);


    }

}