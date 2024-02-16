package ejercicio3;
import java.util.*;
import java.util.stream.Collectors;


public class analizarTendencias {   // Clase que identifica las tendencias por origen`

    public List<Tendencia> identificarTendenciasPorOrigen(List<Tendencia> tendencias, String origen){
        return tendencias.stream().filter(tendencia -> tendencia.getOrigen().equals(origen)).collect(Collectors.toList());  // Filtra las tendencias por origen
    }

}
