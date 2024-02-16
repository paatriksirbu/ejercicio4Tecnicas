package ejercicio5;

public class Sensor {
    // Atributos de la clase Sensor
    private double temperatura;
    private double humedad;
    private String calidadAire;
    private String ubicacion;

    public Sensor(double temperatura, double humedad, String calidadAire, String ubicacion) {
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.calidadAire = calidadAire;
        this.ubicacion = ubicacion;
    }

    // Métodos para modificar los datos de los sensores
    public void modificarTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public void modificarHumedad(double humedad) {
        this.humedad = humedad;
    }

    public void modificarCalidadAire(String calidadAire) {
        this.calidadAire = calidadAire;
    }

    public void modificarUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    // Getters para obtener los datos de los sensores
    public double getTemperatura() {
        return this.temperatura;
    }

    public double getHumedad() {
        return this.humedad;
    }

    public String getCalidadAire() {
        return this.calidadAire;
    }

    public String getUbicacion() {
        return this.ubicacion;
    }

    // Setters privados para que no se puedan modificar los datos de los sensores
    private void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    private void setHumedad(double humedad) {
        this.humedad = humedad;
    }

    private void setCalidadAire(String calidadAire) {
        this.calidadAire = calidadAire;
    }

    private void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    // Método toString para mostrar los datos de los sensores
    public String toString() {
        return "Temperatura: " + this.temperatura + " Humedad: " + this.humedad + " Calidad del aire: " + this.calidadAire + " Ubicación: " + this.ubicacion;
    }

}
