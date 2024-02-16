package ejercicio5;
import java.util.*;

public class InterfazUsuario {
    // Método principal
    public static void main(String[] args) {
        System.out.println("Sistema de Monitoreo");
        System.out.println("Sensores:");

        SistemaMonitoreo sistema = new SistemaMonitoreo();
        Sensor sensor = new Sensor(0, 0, null, null);   // Crear un sensor

        ArrayList<Sensor> sensores = sistema.getSensores(); // Obtener los sensores
        recopilarDatosSensores(sensor); // Recopilar datos de los sensores
        sensores.add(sensor);   // Añadir el sensor a la lista de sensores
        monitorizarSensores(sensores);  // Monitorizar los sensores
    }

    public static Sensor recopilarDatosSensores(Sensor sensor) {    // Recopilar datos de los sensores
        Random rand = new Random();
        Double r1 = rand.nextDouble(27);
        Double r2 = rand.nextDouble(100);

        System.out.println("Sensor en Horcajo de Santiago");    // Mostrar el sensor
        sensor.modificarTemperatura(r1);
        sensor.modificarHumedad(r2);
        sensor.modificarCalidadAire("Buena");
        sensor.modificarUbicacion("Horcajo de Santiago");

        return sensor;
    }

    public static void monitorizarSensores(ArrayList<Sensor> sensores) {    // Monitorizar los sensores
        String datos = sensores.toString();
        System.out.println(datos);
    }
}
