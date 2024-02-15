package ejercicio3;
import java.util.List;

public class ejercicio3 {
    public static void main(String[] args) {
        String[] datos = {};

        analizarTendencias analizarTendencias = new analizarTendencias();
        List<String> tendencias = analizarTendencias.identificarTendencias(datos);

        for (String tendencia : tendencias) {
            System.out.println(tendencia);
        }

    }


}


