package ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Tendencias {
    private List<Tendencia> tendencias = new ArrayList<>();


    public void addTendencia(String nombre, int cantidad, String origen, String categoria, int duracion){
        this.tendencias.add(new Tendencia(nombre, cantidad, origen, categoria, duracion));
    }

    public List<Tendencia> getTendencias(){
        return tendencias;
    }
}
