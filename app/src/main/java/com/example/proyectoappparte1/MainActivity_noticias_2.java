package com.example.proyectoappparte1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity_noticias_2 extends AppCompatActivity {

    WebView wv_noticias;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_noticias2);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launchermamado);

        wv_noticias = (WebView) findViewById(R.id.wv_noticias);
        String URL = getIntent().getStringExtra("sitioWeb");
        if(!URL.startsWith("http://") && !URL.startsWith("https://")){
            URL = "http://" + URL;
        }
        wv_noticias.loadUrl(URL);
    }
}