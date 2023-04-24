package com.example.proyectoappparte1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
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
        tv_nombre = (TextView) findViewById(R.id.tv_nombre);
        int idImagen = getIntent().getIntExtra("avatar", -1);
        if (idImagen != -1) {
            ImageView imageView = findViewById(R.id.iv_pasar);
            imageView.setImageResource(idImagen);
        }
        String dato = getIntent().getStringExtra("dato");
        tv_nombre.setText(dato);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.overflow, menu);
        return true;

    }
    public void brazo (View view) {
        Toast.makeText(this, "brazo lio", Toast.LENGTH_SHORT).show();


    }
    //Método para aherhar las acciones a todos los botones
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();

        if(id == R.id.item1){
            Toast.makeText(this, "Compartir", Toast.LENGTH_SHORT).show();
            return true;
        }
        if(id == R.id.item2){
            Toast.makeText(this, "Buscar", Toast.LENGTH_SHORT).show();
            return true;
        }
        if(id == R.id.item3) {
            Toast.makeText(this, "Opción 1 ", Toast.LENGTH_SHORT).show();
            return true;
        }



        if(id == R.id.item4){
            Toast.makeText(this, "Opción 2 ", Toast.LENGTH_SHORT).show();
            return true;
        }


        return super.onOptionsItemSelected(item);
    }
}
