package ejercicio2;

import java.util.List;

public class SimularRed {
    private Configuracion configuracion;

    public SimularRed(Configuracion configuracion) {
        this.configuracion = configuracion;
    }

    public void simular(){
        Red red = new Red();
        List<Trafico> trafico = red.simularTrafico();
        List<Trafico> cuellosDeBotella = CuellosDeBotella.identificarCuellosDeBotella(trafico);
        mostrarResultados(cuellosDeBotella);
    }


}
