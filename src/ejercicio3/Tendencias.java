package ejercicio3;

import java.util.ArrayList;
import java.util.Collection;

public class Tendencias {
    private ArrayList<Tendencia> tendencias;

    public Tendencias() {
        this.tendencias = new ArrayList<>();
    }

    public void addTendencia(String nombre, int cantidad, String origen, String categoria, int duracion){
        this.tendencias.add(new Tendencia(nombre, cantidad, origen, categoria, duracion));
    }

    public Collection<Tendencia> getTendencias(){
        return this.tendencias;
    }
}
