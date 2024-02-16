package ejercicio5;
import java.util.*;
public class SistemaMonitoreo {
    // Atributos de la clase SistemaMonitoreo
    private ArrayList<Sensor> sensores = new ArrayList<Sensor>();

    // Getters y setters de la clase SistemaMonitoreo
    public ArrayList<Sensor> getSensores() {
        return this.sensores;
    }
    public void setSensores(ArrayList<Sensor> sensores) {
        this.sensores = sensores;
    }
    public void addSensor(Sensor sensor) {
        this.sensores.add(sensor);
    }
    public void removeSensor(Sensor sensor) {
        this.sensores.remove(sensor);
    }


}
