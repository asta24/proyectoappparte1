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


    public void Estiramientospecho(View view){
        Intent i = new Intent(this, MainActivityAdicionales_2.class);
        i.putExtra("sitioWeb", "https://www.fitnessintegral.org/rutina-de-pecho-gym/");
        startActivity(i);
    }
    public void Estiramientosbrazos(View view){
        Intent i = new Intent(this, MainActivityAdicionales_2.class);
        i.putExtra("sitioWeb", "https://www.vitonica.com/entrenamiento/rutina-para-entrenar-tus-brazos-al-completo-gimnasio");
        startActivity(i);
    }
    public void Estiramientospiernas(View view){
        Intent i = new Intent(this, MainActivityAdicionales_2.class);
        i.putExtra("sitioWeb", "https://www.winfitclubs.com/rutina-de-piernas-gym/");
        startActivity(i);
    }
    public void Estiramientosespalda(View view){
        Intent i = new Intent(this, MainActivityAdicionales_2.class);
        i.putExtra("sitioWeb", "https://www.expansion.com/fueradeserie/cuerpo/2022/08/25/62d1384f468aebd5368b466d.html");
        startActivity(i);
    }
    public void Estiramientoshombros(View view){
        Intent i = new Intent(this, MainActivityAdicionales_2.class);
        i.putExtra("sitioWeb", "https://www.expansion.com/fueradeserie/cuerpo/2022/07/13/62c3f6ee468aeb96728b45ef.html");
        startActivity(i);
    }
}