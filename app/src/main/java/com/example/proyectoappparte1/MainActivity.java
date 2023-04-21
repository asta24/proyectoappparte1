package com.example.proyectoappparte1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton btn_avatar1, btn_avatar2, btn_avatar3, btn_avatar4, btn_avatar5, btn_avatar6;
    private EditText et_usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_avatar1 = (ImageButton) findViewById(R.id.btn_avatar1);
        btn_avatar2 = (ImageButton) findViewById(R.id.btn_avatar2);
        btn_avatar3 = (ImageButton) findViewById(R.id.btn_avatar3);
        btn_avatar4 = (ImageButton) findViewById(R.id.btn_avatar4);
        btn_avatar5 = (ImageButton) findViewById(R.id.btn_avatar5);
        btn_avatar6 = (ImageButton) findViewById(R.id.btn_avatar6);
        et_usuario = (EditText) findViewById(R.id.et_usuario);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
       // getSupportActionBar().setIcon(R.mipmap.ic_launchermamado);
    }
    public void usuario1 (View view){
        Intent i = new Intent(this, MenuPrincipal. class);
        i.putExtra("dato",et_usuario.getText().toString());
        startActivity(i);

    }
    public void usuario2 (View view) {
        Intent i = new Intent(this, MenuPrincipal. class);
        i.putExtra("dato", et_usuario.getText().toString());
        startActivity(i);
    }
    public void usuario3 (View view) {
        Intent i = new Intent(this, MenuPrincipal. class);
        i.putExtra("dato", et_usuario.getText().toString());
        startActivity(i);
    }
    public void usuario4 (View view) {
        Intent i = new Intent(this, MenuPrincipal. class);
        i.putExtra("dato", et_usuario.getText().toString());

        startActivity(i);
    }
    public void usuario5 (View view) {
        Intent i = new Intent(this, MenuPrincipal. class);
        i.putExtra("dato", et_usuario.getText().toString());
        startActivity(i);
    }
    public void usuario6 (View view) {
        Intent i = new Intent(this, MenuPrincipal. class);
        i.putExtra("dato", et_usuario.getText().toString());
        startActivity(i);
    }



}