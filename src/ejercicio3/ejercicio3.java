package ejercicio3;

import java.util.List;

public class ejercicio3 {


    public static void main(String[] args) {
        // Crear una colección de tendencias
        Tendencias tendencias = GeneradorTendencias.generarColeccionTendencias();
        analizarTendencias analizarTendencias = new analizarTendencias();

        // Mostrar las tendencias de TikTok
        System.out.println("Tendencias de TikTok: \n");
        List<Tendencia> tendenciasTikTok = analizarTendencias.identificarTendenciasPorOrigen(tendencias.getTendencias(), "TikTok");
        for (Tendencia tendencia : tendenciasTikTok) {
            System.out.println(tendencia);
        }
        // Mostrar las tendencias de YouTube
        System.out.println("\n Tendencias de YouTube: \n");
        List<Tendencia> tendenciasYoutube = analizarTendencias.identificarTendenciasPorOrigen(tendencias.getTendencias(), "YouTube");
        for (Tendencia tendencia : tendenciasYoutube) {
            System.out.println(tendencia);
        }

    }




}


