package ejercicio2;

import java.util.*;


public class ejercicio2 {

    public static Red crearRed(Configuracion configuracion){
        Red red = new Red();
        for (int i = 0; i < configuracion.cantidadRouters; i++) {
            red.agregarDispositivo(new Router("ejercicio2.Router" + i));
        }
        for (int i = 0; i < configuracion.cantidadSwitches; i++) {
            red.agregarDispositivo(new Switch("ejercicio2.Switch" + i));
        }
        for (int i = 0; i < configuracion.cantidadComputadoras; i++) {
            red.agregarDispositivo(new Computadora("ejercicio2.Computadora" + i));
        }

        return red;
    }

    public static void main(String[] args) {

    }

}

