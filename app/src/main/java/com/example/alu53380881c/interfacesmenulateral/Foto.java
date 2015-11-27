package com.example.alu53380881c.interfacesmenulateral;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.widget.ArrayAdapter;

/**
 * Created by alu53380881c on 05/11/15.
 */
public class Foto {
    private String titulo;
    private Drawable imagen;
    private ArrayAdapter<String> adapter;

    public Foto(String tit, Drawable img) {
        titulo = tit;
        imagen = img;
    }

    public String getTitulo() {
        return titulo;
    }

    public Drawable getImagen() {
        return imagen;
    }

    public ArrayAdapter<String> getAdapter() {
        return adapter;
    }
}