package com.example.proyectoappparte1;

import android.app.Application;

public class Aplicacion extends Application {
    private int imagenSeleccionada;
    private String nombreUsuario;

    public int getImagenSeleccionada() {
        return imagenSeleccionada;
    }

    public void setImagenSeleccionada(int imagenSeleccionada) {
        this.imagenSeleccionada = imagenSeleccionada;
    }
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
}

