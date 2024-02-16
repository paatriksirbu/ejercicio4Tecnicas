package ejercicio4;
import java.util.*;
import java.time.*;
import java.time.format.*;
public class ProcesarSolicitud {
    public String procesarSolicitud(String solicitud) { // Método que procesa la solicitud del usuario
        solicitud = solicitud.toLowerCase();
        if (solicitud.contains("hola")) {
            return "Hola, ¿en qué puedo ayudarte?";
        }
        else if (solicitud.contains("buenos dias")) {
            return "Buenos días, ¿en qué puedo ayudarte?";
        } else if (solicitud.contains("buenas tardes")) {
            return "Buenas tardes, ¿en qué puedo ayudarte?";
        } else if (solicitud.contains("buenas noches")) {
            return "Buenas noches, ¿en qué puedo ayudarte?";
        } else if (solicitud.contains("hora")){
            return "Son las " + LocalTime.now().format(DateTimeFormatter.ofPattern("hh:mm a"));
        } else if (solicitud.contains("fecha")){
            return "Hoy es " + LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        } else if (solicitud.contains("como estas")){
            return "Estoy bien, gracias por preguntar";
        } else if (solicitud.contains("establece recordatorio")){
            return "Recordatorio establecido"; //aunque realmente no funcione
        } else if (solicitud.contains("gracias")){
            return "De nada, es un placer ayudarte";
        } else if (solicitud.contains("adios")){
            System.exit(0);
            return "Adios, que tengas un buen día";
        } else {
            return "No he podido entender tu solicitud";
        }
    }
}