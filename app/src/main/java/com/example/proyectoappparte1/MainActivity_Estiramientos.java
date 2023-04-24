package com.example.proyectoappparte1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity_Estiramientos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_estiramientos);
    }
    public void Scrollview (View view) {

        switch (view.getId()) {

            case R.id.pechofondos24:
                Toast.makeText(this, "pecho", Toast.LENGTH_SHORT).show();
                break;

            case R.id.brazobueno:
                Toast.makeText(this, "brazo", Toast.LENGTH_SHORT).show();
                break;

            case R.id.piernafondo:
                Toast.makeText(this, "piernas", Toast.LENGTH_SHORT).show();
                break;

            case R.id.espaldafondo1:
                Toast.makeText(this, "espalda", Toast.LENGTH_SHORT).show();
                break;



        }

    }
}