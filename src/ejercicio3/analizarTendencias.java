package ejercicio3;
import java.util.List;
import java.util.ArrayList;


public class analizarTendencias {

    public List<String> identificarTendencias(String[] datos){
        List<String> tendencias = new ArrayList<>();
        for (String dato : datos) {
                tendencias.add(dato);
        }
        return tendencias;
    }
}