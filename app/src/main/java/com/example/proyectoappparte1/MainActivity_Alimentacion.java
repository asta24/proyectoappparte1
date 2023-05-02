package com.example.proyectoappparte1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity_Alimentacion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_alimentacion);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launchermamado);
    }

    // Páginas web que se acceden al pinchar en el overflow: Alimentación //
    public void Menuvolumen(View view){
        Intent i = new Intent(this, MainActivity_Alimentacion_2.class);
        i.putExtra("sitioWeb", "https://www.cambiatufisico.com/dieta-herculea/");
        startActivity(i);
    }
    public void Menudefinicion(View view){
        Intent i = new Intent(this, MainActivity_Alimentacion_2.class);
        i.putExtra("sitioWeb", "https://www.vogue.es/belleza/articulos/como-perder-grasa-corporal-ganar-musculo-comer-proteinas-menu");
        startActivity(i);
    }
}