package com.example.proyectoappparte1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;

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
    public void usuario1 (View view){
        Intent i = new Intent(this, MenuPrincipal. class);
        i.putExtra("dato",et_usuario.getText().toString());
        i.putExtra("avatar", R.drawable.av1);
        startActivity(i);

    }
    public void usuario2 (View view) {
        Intent i = new Intent(this, MenuPrincipal. class);
        i.putExtra("dato", et_usuario.getText().toString());
        i.putExtra("avatar", R.drawable.av2);
        startActivity(i);
    }
    public void usuario3 (View view) {
        Intent i = new Intent(this, MenuPrincipal. class);
        i.putExtra("dato", et_usuario.getText().toString());
        i.putExtra("avatar", R.drawable.av3);
        startActivity(i);
    }
    public void usuario4 (View view) {
        Intent i = new Intent(this, MenuPrincipal. class);
        i.putExtra("dato", et_usuario.getText().toString());
        i.putExtra("avatar", R.drawable.av4);

        startActivity(i);
    }
    public void usuario5 (View view) {
        Intent i = new Intent(this, MenuPrincipal. class);
        i.putExtra("dato", et_usuario.getText().toString());
        i.putExtra("avatar", R.drawable.av5);
        startActivity(i);
    }
    public void usuario6 (View view) {
        Intent i = new Intent(this, MenuPrincipal. class);
        i.putExtra("dato", et_usuario.getText().toString());
        i.putExtra("avatar", R.drawable.av6);
        startActivity(i);
    }



}