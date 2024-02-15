package ejercicio2;

import java.util.*;


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

        Configuracion configuracion = Configuracion.obtenerConfigUsuario();
    }

}

