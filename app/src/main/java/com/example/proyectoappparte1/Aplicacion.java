package com.example.proyectoappparte1;

import android.app.Application;

public class Aplicacion extends Application {

    private int imagenSeleccionada;

    public int getImagenSeleccionada() {
        return imagenSeleccionada;
    }

    public void setImagenSeleccionada(int imagenSeleccionada) {
        this.imagenSeleccionada = imagenSeleccionada;
    }
}


