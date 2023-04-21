package com.example.proyectoappparte1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MenuPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
    }
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.overflow, menu);
        return true;

    }
    //Método para aherhar las acciones a todos los botones
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();

        if(id == R.id.item3){
            Toast.makeText(this, "Compartir", Toast.LENGTH_SHORT).show();
            return true;
        }
        if(id == R.id.item4){
            Toast.makeText(this, "Buscar", Toast.LENGTH_SHORT).show();
            return true;
        }
        if(id == R.id.item1){
            Toast.makeText(this, "Opción 1 ", Toast.LENGTH_SHORT).show();
            return true;
        }
        if(id == R.id.item2){
            Toast.makeText(this, "Opción 2 ", Toast.LENGTH_SHORT).show();
            return true;
        }
        

        return super.onOptionsItemSelected(item);
    }
}
