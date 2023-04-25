package com.example.proyectoappparte1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class VerBrazo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_brazo);
        ImageView imageView = findViewById(R.id.gifImageView);
        Glide.with(this).asGif().load(R.drawable.fuegogif).into(imageView);
    }
}