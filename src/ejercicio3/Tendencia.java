package ejercicio3;

public class Tendencia {
    private String nombre;
    private int cantidad;
    private String origen;
    private String categoria;
    private int duracion; // en horas

    public Tendencia(String nombre, int cantidad, String origen, String categoria, int duracion) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.origen = origen;
        this.categoria = categoria;
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getOrigen() {
        return origen;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setCantidadMenciones(int cantidad){
        if (cantidad < 0){
            throw new IllegalArgumentException("La cantidad de menciones no puede ser menor que 0.");
        }
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Tendencia{" +
                "nombre='" + nombre + '\'' +
                ", cantidad=" + cantidad +
                ", origen='" + origen + '\'' +
                ", categoria='" + categoria + '\'' +
                ", duracion=" + duracion +
                '}';
    }
}
