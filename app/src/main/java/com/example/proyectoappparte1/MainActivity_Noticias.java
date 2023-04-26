package com.example.proyectoappparte1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity_Noticias extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_noticias);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launchermamado);
    }
    public void Noticiasmaquinas(View view){
        Intent i = new Intent(this, MainActivity_noticias_2.class);
        i.putExtra("sitioWeb", "https://www.gymcompany.es/");
        startActivity(i);
    }
    public void Noticiassuplementos(View view){
        Intent i = new Intent(this, MainActivity_noticias_2.class);
        i.putExtra("sitioWeb", "https://sergioromeropersonaltrainer.com/blog/suplementacion-en-el-deporte-mitos-y-verdades/");
        startActivity(i);
    }
}