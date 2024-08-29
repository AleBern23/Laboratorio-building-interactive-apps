package com.example.proyectosaofertar;

import java.util.ArrayList;
import java.util.List;

public class ProyectosOfertados {
    public List<String> obtenerProytecto (String spinner){
        List<String> proyectos = new ArrayList<>();
        if (spinner.equals("Infraestructura")){
            proyectos.add("Parques");
            proyectos.add("Zonas Verdes");
            proyectos.add("Vías");
        } else if (spinner.equals("Recreación")) {
            proyectos.add("Ciclovías");
            proyectos.add("Parques");
        }else {
            proyectos.add("Proyecto no seleccionado");
        }
        return proyectos;
    }
}
