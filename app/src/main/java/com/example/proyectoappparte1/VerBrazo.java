package com.example.proyectoappparte1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class VerBrazo extends AppCompatActivity {
    private EditText tv_nombre6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_brazo);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launchermamado);
        ImageView imageView = findViewById(R.id.iv_pasar6);
        TextView tv_nombre6 = findViewById(R.id.tv_nombre6);
        Aplicacion aplicacion = (Aplicacion) getApplication();
        int imagenSeleccionada = aplicacion.getImagenSeleccionada();
        imageView.setImageResource(imagenSeleccionada);
        String nombreUsuario = aplicacion.getNombreUsuario();
        tv_nombre6.setText(nombreUsuario);
        String GifSeleccionado = getIntent().getStringExtra("gif_seleccionado");
        ImageView imageView2 = findViewById(R.id.gifImageView);
        Glide.with(this).asGif().load(getResources().getIdentifier(GifSeleccionado, "drawable", getPackageName())).into(imageView2);

    }
}