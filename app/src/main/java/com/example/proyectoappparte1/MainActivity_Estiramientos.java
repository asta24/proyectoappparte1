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
        i.putExtra("sitioWeb", "https://www.youtube.com/watch?v=LVZZCk7mijw");
        startActivity(i);
    }
    public void Estiramientosbrazos(View view){
        Intent i = new Intent(this, MainActivityAdicionales_2.class);
        i.putExtra("sitioWeb", "https://www.youtube.com/watch?v=HwBI6ZPnooA");
        startActivity(i);
    }
    public void Estiramientospiernas(View view){
        Intent i = new Intent(this, MainActivityAdicionales_2.class);
        i.putExtra("sitioWeb", "https://www.youtube.com/watch?v=-uJIvJPGqQM");
        startActivity(i);
    }
    public void Estiramientosespalda(View view){
        Intent i = new Intent(this, MainActivityAdicionales_2.class);
        i.putExtra("sitioWeb", "https://www.youtube.com/watch?v=Lk9srPgjF4c");
        startActivity(i);
    }
    public void Estiramientoshombros(View view){
        Intent i = new Intent(this, MainActivityAdicionales_2.class);
        i.putExtra("sitioWeb", "https://www.youtube.com/watch?v=LTkL3IaV8Go");
        startActivity(i);
    }
}