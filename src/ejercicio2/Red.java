package ejercicio2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Red {
    List<Dispositivo> dispositivos = new ArrayList<>();

    public Red() {
        this.dispositivos = new ArrayList<>();
    }

    public void agregarDispositivo(Dispositivo dispositivo) {
        dispositivos.add(dispositivo);
    }

    public Map<Dispositivo, Double> simularTrafico() {
        Map<Dispositivo, Double> traficoDispositivos = new HashMap<>();

        for (Dispositivo dispositivo : dispositivos) {
            double trafico = Math.random() * 100;
            traficoDispositivos.put(dispositivo, trafico);
        }
        return traficoDispositivos;
    }
}
