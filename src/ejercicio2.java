import java.util.*;

class Red{
    List<Dispositivo> dispositivos = new ArrayList<>();

    public Red() {
        this.dispositivos = new ArrayList<>();
    }

    public void agregarDispositivo(Dispositivo dispositivo){
        dispositivos.add(dispositivo);
    }

    public Map<Dispositivo, Double> simularTrafico(){
        Map<Dispositivo, Double> traficoDispositivos = new HashMap<>();

        for (Dispositivo dispositivo: dispositivos) {
           double trafico = Math.random() * 100;
              traficoDispositivos.put(dispositivo, trafico);
        }
        return traficoDispositivos;
    }
}

abstract class Dispositivo{     //quiero routers, switches, computadoras, impresoras
    String nombre;

    public Dispositivo(String nombre) {
        this.nombre = nombre;
    }
}

class Router extends Dispositivo{
    public Router(String nombre) {
        super(nombre);
    }
}

class Switch extends Dispositivo{
    public Switch(String nombre) {
        super(nombre);
    }
}

class Computadora extends Dispositivo{
    public Computadora(String nombre) {
        super(nombre);
    }
}

class Configuracion{
    int cantidadRouters;
    int cantidadSwitches;
    int cantidadComputadoras;

    public Configuracion(int cantidadRouters, int cantidadSwitches, int cantidadComputadoras) {
        this.cantidadRouters = cantidadRouters;
        this.cantidadSwitches = cantidadSwitches;
        this.cantidadComputadoras = cantidadComputadoras;
    }
}


public class ejercicio2 {

    public static Red crearRed(Configuracion configuracion){
        Red red = new Red();
        for (int i = 0; i < configuracion.cantidadRouters; i++) {
            red.agregarDispositivo(new Router("Router" + i));
        }
        for (int i = 0; i < configuracion.cantidadSwitches; i++) {
            red.agregarDispositivo(new Switch("Switch" + i));
        }
        for (int i = 0; i < configuracion.cantidadComputadoras; i++) {
            red.agregarDispositivo(new Computadora("Computadora" + i));
        }

        return red;
    }

    public static void main(String[] args) {

    }

}

