package ejercicio2;
import java.util.List;

public class CuellosDeBotella {
    public static void identificarCuellosDeBotella(List<Trafico> trafico){
        for (Trafico t : trafico) {
            if (t.esCuelloBotella()){
                System.out.println("El trafico entre " + t.getOrigen() + " y " + t.getDestino() + " es un cuello de botella");
            }
        }
    }
}
