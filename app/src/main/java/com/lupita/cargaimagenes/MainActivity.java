package com.lupita.cargaimagenes;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.lupita.cargaimagenes.data.RequestIma;
import com.lupita.cargaimagenes.model.ImagenC;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static ArrayList<ImagenC> heroesArrayList;
    RequestIma objImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        objImage = new RequestIma(this);
        objImage.cargaIRequests();
    }
    //Funcionando al 100% y cargando imagenes en fragmentos
}