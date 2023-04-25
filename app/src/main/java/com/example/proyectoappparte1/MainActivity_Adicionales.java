package com.example.proyectoappparte1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity_Adicionales extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_adicionales);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launchermamado);
    }
    public void Scrollview (View view) {

        switch (view.getId()) {

            case R.id.image_pecho:
                Toast.makeText(this, "Ejercicios Adicionales de Pecho", Toast.LENGTH_SHORT).show();
                break;


            case R.id.image_brazos:
                Toast.makeText(this, "Ejercicios Adicionales de Brazos", Toast.LENGTH_SHORT).show();
                break;


        case R.id.image_piernas:
                Toast.makeText(this, "Ejercicios Adicionales de Piernas", Toast.LENGTH_SHORT).show();
                break;


            case R.id.image_espalda:
                Toast.makeText(this, "Ejercicios Adicionales de Espalda", Toast.LENGTH_SHORT).show();
                break;


            case R.id.image_hombros:
                Toast.makeText(this, "Ejercicios Adicionales de Hombros", Toast.LENGTH_SHORT).show();
                break;

       }

    }
        public void Navegarpecho(View view){
        Intent i = new Intent(this, MainActivityAdicionales_2.class);
        i.putExtra("sitioWeb", "www.españa.com");
        startActivity(i);
    }
         public void Navegarbrazo(View view){
        Intent i = new Intent(this, MainActivityAdicionales_2.class);
        i.putExtra("sitioWeb", "www.vitonica.com");
        startActivity(i);
    }
    public void Navegarpiernas(View view){
        Intent i = new Intent(this, MainActivityAdicionales_2.class);
        i.putExtra("sitioWeb", "www.abc.com");
        startActivity(i);
    }
    public void Navegarespalda(View view){
        Intent i = new Intent(this, MainActivityAdicionales_2.class);
        i.putExtra("sitioWeb", "www.marca.com");
        startActivity(i);
    }
    public void Navegarhombros(View view){
        Intent i = new Intent(this, MainActivityAdicionales_2.class);
        i.putExtra("sitioWeb", "www.as.com");
        startActivity(i);
    }
}