package ejercicio3;
import java.util.List;

public class ejercicio3 {
    public static void main(String[] args) {

        Tendencias tendencias = GeneradorTendencias.generarColeccionTendencias();

        for (Tendencia tendencia : tendencias.getTendencias()) {
            System.out.println(tendencia);
        }

    }


}


