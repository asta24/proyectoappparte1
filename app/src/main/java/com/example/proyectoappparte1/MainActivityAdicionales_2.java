package com.example.proyectoappparte1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivityAdicionales_2 extends AppCompatActivity {
    WebView wv_adicionales;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_adicionales2);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launchermamado);

        wv_adicionales = (WebView) findViewById(R.id.wv_adicionales);
        String URL = getIntent().getStringExtra("sitioWeb");
        if(!URL.startsWith("http://") && !URL.startsWith("https://")){
            URL = "http://" + URL;
        }
        wv_adicionales.loadUrl(URL);
    }
        public void Volver (View view){
            finish();
        }
    }


