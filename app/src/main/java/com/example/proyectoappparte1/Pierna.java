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
    //mandamos el gif y el text a la actividad tiempo
    public void pierna1 (View view) {
        Intent i = new Intent(this, tiempo.class);
        i.putExtra("gif_seleccionado", "sentadilla");
        i.putExtra("series", "Realiza 3 series de este ejercicio");
        startActivity(i);


    }
    public void pierna2 (View view) {
        Intent i = new Intent(this, tiempo.class);
        i.putExtra("gif_seleccionado", "bulgara");
        i.putExtra("series", "Realiza 3 series de este ejercicio");
        startActivity(i);


    }
    public void pierna3 (View view) {
        Intent i = new Intent(this, tiempo.class);
        i.putExtra("gif_seleccionado", "femoral");
        i.putExtra("series", "Realiza 3 series de este ejercicio");
        startActivity(i);


    }
    public void pierna4 (View view) {
        Intent i = new Intent(this, tiempo.class);
        i.putExtra("gif_seleccionado", "sentado");
        i.putExtra("series", "Realiza 3 series de este ejercicio");
        startActivity(i);


    }
    public void pierna5 (View view) {
        Intent i = new Intent(this, tiempo.class);
        i.putExtra("gif_seleccionado", "piernaestendida");
        i.putExtra("series", "Realiza 3 series de este ejercicio");
        startActivity(i);


    }
    public void pierna6 (View view) {
        Intent i = new Intent(this, tiempo.class);
        i.putExtra("gif_seleccionado", "abdomen");
        i.putExtra("series", "Realiza 5 series de este ejercicio");
        startActivity(i);


    }

}