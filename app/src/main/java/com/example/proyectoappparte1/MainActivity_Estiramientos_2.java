package com.example.proyectoappparte1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity_Estiramientos_2 extends AppCompatActivity {
    WebView wv_estiramientos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_estiramientos2);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launchermamado);

        wv_estiramientos = (WebView) findViewById(R.id.wv_estiramientos);
        String URL = getIntent().getStringExtra("sitioWeb");
        if(!URL.startsWith("http://") && !URL.startsWith("https://")){
            URL = "http://" + URL;
        }
        wv_estiramientos.loadUrl(URL);

    }
}
