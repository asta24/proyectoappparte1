package com.example.proyectoappparte1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity_Adicionales extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_adicionales);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launchermamado);
    }

    // Páginas web que se acceden al pinchar en el overflow: Rutinas adicionales//
        public void Navegarpecho(View view){
        Intent i = new Intent(this, MainActivityAdicionales_2.class);
        i.putExtra("sitioWeb", "https://www.menshealth.com/es/fitness/a27264157/mejores-ejercicios-pecho-pectoral/");
        startActivity(i);
    }
        public void Navegarbrazo(View view){
        Intent i = new Intent(this, MainActivityAdicionales_2.class);
        i.putExtra("sitioWeb", "https://www.vitonica.com/entrenamiento/rutina-para-entrenar-tus-brazos-al-completo-gimnasio");
        startActivity(i);
    }
        public void Navegarpiernas(View view){
        Intent i = new Intent(this, MainActivityAdicionales_2.class);
        i.putExtra("sitioWeb", "https://www.winfitclubs.com/rutina-de-piernas-gym/");
        startActivity(i);
    }
        public void Navegarespalda(View view){
        Intent i = new Intent(this, MainActivityAdicionales_2.class);
        i.putExtra("sitioWeb", "https://www.expansion.com/fueradeserie/cuerpo/2022/08/25/62d1384f468aebd5368b466d.html");
        startActivity(i);
    }
        public void Navegarhombros(View view){
        Intent i = new Intent(this, MainActivityAdicionales_2.class);
        i.putExtra("sitioWeb", "https://www.expansion.com/fueradeserie/cuerpo/2022/07/13/62c3f6ee468aeb96728b45ef.html");
        startActivity(i);
    }
}