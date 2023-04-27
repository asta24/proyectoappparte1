package com.example.proyectoappparte1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView iv_avatar1, iv_avatar2, iv_avatar3, iv_avatar4, iv_avatar5, iv_avatar6;
    private EditText et_usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv_avatar1 = (ImageView) findViewById(R.id.iv_avatar1);
        iv_avatar2 = (ImageView) findViewById(R.id.iv_avatar2);
        iv_avatar3 = (ImageView) findViewById(R.id.iv_avatar3);
        iv_avatar4 = (ImageView) findViewById(R.id.iv_avatar4);
        iv_avatar5 = (ImageView) findViewById(R.id.iv_avatar5);
        iv_avatar6 = (ImageView) findViewById(R.id.iv_avatar6);
        et_usuario = (EditText) findViewById(R.id.et_usuario);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launchermamado_background);

    }
    public void onClick(View v) {
        int imagenSeleccionada = 0;
        if (et_usuario.getText().toString().isEmpty()) {
            Toast.makeText(this, "El campo Nombre no puede estar vacío", Toast.LENGTH_SHORT).show();

        } else {
            switch (v.getId()) {
                case R.id.iv_avatar1:
                    imagenSeleccionada = R.drawable.av1;
                    break;
                case R.id.iv_avatar2:
                    imagenSeleccionada = R.drawable.av2;
                    break;
                case R.id.iv_avatar3:
                    imagenSeleccionada = R.drawable.av3;
                    break;
                case R.id.iv_avatar4:
                    imagenSeleccionada = R.drawable.av4;
                    break;
                case R.id.iv_avatar5:
                    imagenSeleccionada = R.drawable.av5;
                    break;
                case R.id.iv_avatar6:
                    imagenSeleccionada = R.drawable.av6;
                    break;
            }
            // Lanzar la siguiente actividad y pasar el ID de la imagen seleccionada
            Intent i = new Intent(this, MenuPrincipal.class);
            i.putExtra("dato", et_usuario.getText().toString());
            Aplicacion aplicacion = (Aplicacion) getApplication();
            aplicacion.setImagenSeleccionada(imagenSeleccionada);
            startActivity(i);


        }

    }
}