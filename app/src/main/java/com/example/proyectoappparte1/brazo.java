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
        ImageView imageView = findViewById(R.id.iv_pasar2);
        TextView tv_nombre2 = findViewById(R.id.tv_nombre2);
        Aplicacion aplicacion = (Aplicacion) getApplication();
        int imagenSeleccionada = aplicacion.getImagenSeleccionada();
        imageView.setImageResource(imagenSeleccionada);
        String nombreUsuario = aplicacion.getNombreUsuario();
        tv_nombre2.setText(nombreUsuario);
    }
    //mandamos el gif y el text a la actividad tiempo
    public void brazo1 (View view) {
        Intent i = new Intent(this, tiempo.class);
        i.putExtra("gif_seleccionado", "curlbueno");
        i.putExtra("series", "Realiza 3 series de este ejercicio");
        startActivity(i);


    }
    public void brazo2 (View view) {
        Intent i = new Intent(this, tiempo.class);
        i.putExtra("gif_seleccionado", "concentrado");
        i.putExtra("series", "Realiza 3 series de este ejercicio");
        startActivity(i);


    }
    public void brazo3 (View view) {
        Intent i = new Intent(this, tiempo.class);
        i.putExtra("gif_seleccionado", "martillo");
        i.putExtra("series", "Realiza 2 series de este ejercicio");
        startActivity(i);


    }
    public void brazo4 (View view) {
        Intent i = new Intent(this, tiempo.class);
        i.putExtra("gif_seleccionado", "tricepsunbrazo");
        i.putExtra("series", "Realiza 3 series de este ejercicio");
        startActivity(i);


    }
    public void brazo5 (View view) {
        Intent i = new Intent(this, tiempo.class);
        i.putExtra("gif_seleccionado", "tricepsnopolea");
        i.putExtra("series", "Realiza 3 series de este ejercicio");
        startActivity(i);


    }

    public void brazo6 (View view) {
        Intent i = new Intent(this, tiempo.class);
        i.putExtra("gif_seleccionado", "antebrazo");
        i.putExtra("series", "Realiza 2 series de este ejercicio");
        startActivity(i);


    }
}