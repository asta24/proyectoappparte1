package com.example.proyectoappparte1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MenuPrincipal extends AppCompatActivity {
    private TextView tv_nombre;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launchermamado);
        ImageView imageView = findViewById(R.id.iv_pasar);
        tv_nombre = findViewById(R.id.tv_nombre);
        Aplicacion aplicacion = (Aplicacion) getApplication();
        int imagenSeleccionada = aplicacion.getImagenSeleccionada();
        imageView.setImageResource(imagenSeleccionada);
        String nombreUsuario = aplicacion.getNombreUsuario();
        tv_nombre.setText(nombreUsuario);


    }
//creamos el overflow
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.overflow, menu);
        return true;

    }

    //Método para aherhar las acciones a todos los botones del overflow
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();

        if(id == R.id.item1){
            Intent i = new Intent(this, MainActivity_Adicionales. class);
            startActivity(i);
        }
        if(id == R.id.item2){
            Intent i = new Intent(this, MainActivity_Alimentacion. class);
            startActivity(i);
        }
        if(id == R.id.item3) {
            Intent i = new Intent(this, MainActivity_Estiramientos. class);
            startActivity(i);
        }

        if(id == R.id.item4){
            Intent i = new Intent(this, MainActivity_Noticias. class);
            startActivity(i);
        }

        return super.onOptionsItemSelected(item);
    }
    //dependiendo de la imagen q pulse manda a su respectiva actividad
    public void brazo (View view){

        Intent i = new Intent(this, brazo. class);
        startActivity(i);
    }
    public void pecho (View view){
        Intent i = new Intent(this, Pecho. class);
        startActivity(i);
    }
    public void espalda (View view){
        Intent i = new Intent(this, Espalda. class);
        startActivity(i);
    }
    public void pierna (View view){
        Intent i = new Intent(this, Pierna. class);
        startActivity(i);
    }
}
