package ejercicio4;
import java.util.*;

public class InteraccionUsuario {   // Clase que se encarga de la interacción con el usuario

    private Scanner sc;

    public InteraccionUsuario() {   // Constructor de la clase
        this.sc = new Scanner(System.in);
    }

    public String obtenerSolicitud() {  // Metodo para obtener la solicitud del usuario
        System.out.println("Usuario: ");
        return sc.nextLine();
    }

}
