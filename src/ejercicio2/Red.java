package ejercicio2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Red {

    private String nombre;
    private String tipoUso;
    private String tipoDatos;

    ArrayList<Dispositivo> dispositivos = new ArrayList<>();

    public Red() {
        this.nombre = nombre;
        this.tipoUso = tipoUso;
        this.tipoDatos = tipoDatos;
        this.dispositivos = dispositivos;
    }

    public void agregarDispositivo(Dispositivo dispositivo) {
        dispositivos.add(dispositivo);
    }


    public void eliminarDispositivo(Dispositivo dispositivo) {
        dispositivos.remove(dispositivo);
    }

    public void crearRed(Configuracion configuracion) {
        configuracion = Configuracion.obtenerConfigUsuario();

        Trafico trafico = simularTrafico();

    }

     public Trafico simularTrafico() {
          Trafico trafico = new Trafico();

          Map<Dispositivo, Double> traficoDispositivos = new HashMap<>();

          for (Dispositivo dispositivo : dispositivos) {
                double traficoDispo = Math.random() * 100;
                traficoDispositivos.put(dispositivo, traficoDispo);
          }
          return trafico;
     }


}
