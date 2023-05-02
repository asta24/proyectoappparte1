package com.example.proyectoappparte1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Pecho extends AppCompatActivity {
    private EditText tv_nombre3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pecho);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launchermamado);
        ImageView imageView = findViewById(R.id.iv_pasar3);
        TextView tv_nombre3 = findViewById(R.id.tv_nombre3);
        Aplicacion aplicacion = (Aplicacion) getApplication();
        int imagenSeleccionada = aplicacion.getImagenSeleccionada();
        imageView.setImageResource(imagenSeleccionada);
        String nombreUsuario = aplicacion.getNombreUsuario();
        tv_nombre3.setText(nombreUsuario);

    }
    //mandamos el gif y el text a la actividad tiempo
    public void pecho1 (View view) {
        Intent i = new Intent(this, tiempo.class);
        i.putExtra("gif_seleccionado", "banca");
        i.putExtra("series", "Realiza 4 series de este ejercicio");
        startActivity(i);


    }
    public void pecho2 (View view) {
        Intent i = new Intent(this, tiempo.class);
        i.putExtra("gif_seleccionado", "pressinclinadogif");
        i.putExtra("series", "Realiza 3 series de este ejercicio");
        startActivity(i);


    }
    public void pecho3 (View view) {
        Intent i = new Intent(this, tiempo.class);
        i.putExtra("gif_seleccionado", "press_militar");
        i.putExtra("series", "Realiza 3 series de este ejercicio");
        startActivity(i);


    }
    public void pecho4 (View view) {
        Intent i = new Intent(this, tiempo.class);
        i.putExtra("gif_seleccionado", "laterales");
        i.putExtra("series", "Realiza 3 series de este ejercicio");
        startActivity(i);


    }
    public void pecho5 (View view) {
        Intent i = new Intent(this, tiempo.class);
        i.putExtra("gif_seleccionado", "tricepsnopolea");
        i.putExtra("series", "Realiza 4 series de este ejercicio");
        startActivity(i);


    }
    public void pecho6 (View view) {
        Intent i = new Intent(this, tiempo.class);
        i.putExtra("gif_seleccionado", "fondos");
        i.putExtra("series", "Realiza 2 series de este ejercicio");
        startActivity(i);


    }
}