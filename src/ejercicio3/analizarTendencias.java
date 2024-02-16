package ejercicio3;
import java.util.*;
import java.util.stream.Collectors;


public class analizarTendencias {

    public List<Tendencia> identificarTendenciasPorOrigen(List<Tendencia> tendencias, String origen){
        return tendencias.stream().filter(tendencia -> tendencia.getOrigen().equals(origen)).collect(Collectors.toList());
    }

}
