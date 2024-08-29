package com.example.proyectosaofertar;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.List;

public class MainActivity extends AppCompatActivity{
    private ProyectosOfertados pOfertados = new ProyectosOfertados();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
    }
    public void onClickProyecto(View view){
        TextView textView = (TextView) findViewById(R.id.textView);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);

        String proyectoOfertado = String.valueOf(spinner.getSelectedItem());

        List<String> proyectosOfertados = pOfertados.obtenerProytecto(proyectoOfertado);
        StringBuilder pOferCat = new StringBuilder();
        for (String proyecto : proyectosOfertados)
            pOferCat.append(proyecto).append('\n');
        textView.setText(pOferCat);
    }
}