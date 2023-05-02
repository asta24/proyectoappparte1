package com.example.proyectoappparte1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity_Estiramientos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_estiramientos);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launchermamado);
    }

    // Páginas web que se acceden al pinchar en el overflow: Estiramientos //
    public void Estiramientospecho(View view){
        Intent i = new Intent(this, MainActivityAdicionales_2.class);
        i.putExtra("sitioWeb", "https://www.vitonica.com/entrenamiento/ejercicios-para-estirar-el-pectoral");
        startActivity(i);
    }
    public void Estiramientosbrazos(View view){
        Intent i = new Intent(this, MainActivityAdicionales_2.class);
        i.putExtra("sitioWeb", "https://www.marie-claire.es/belleza/15824.html");
        startActivity(i);
    }
    public void Estiramientospiernas(View view){
        Intent i = new Intent(this, MainActivityAdicionales_2.class);
        i.putExtra("sitioWeb", "https://www.glamour.es/belleza/cuerpo/articulos/estiramientos-piernas-dolor-muscular/44447");
        startActivity(i);
    }
    public void Estiramientosespalda(View view){
        Intent i = new Intent(this, MainActivityAdicionales_2.class);
        i.putExtra("sitioWeb", "https://www.tucanaldesalud.es/es/teinteresa/consejos-saludables-trabajar-frente-pantalla/ejercicios-estiramientos-espalda");
        startActivity(i);
    }
    public void Estiramientoshombros(View view){
        Intent i = new Intent(this, MainActivityAdicionales_2.class);
        i.putExtra("sitioWeb", "https://www.efisioterapia.net/articulos/ejercicios-estiramientos-hombros");
        startActivity(i);
    }
}