package ejercicio2;

public class Trafico {

    private Dispositivo origen;
    private Dispositivo destino;
    private int duracion;
    private int cantidadDatos;

    public Dispositivo getOrigen() {
        return origen;
    }

    public Dispositivo getDestino() {
        return destino;
    }

    public int getCantidadDatos() {
        return cantidadDatos;
    }

    public Trafico() {
        this.origen = origen;
        this.destino = destino;
        this.duracion = duracion;
        this.cantidadDatos = cantidadDatos;
    }

    public int getDuracion() {
        return duracion;
    }

    public void analizarTrafico(){
        if (this.cantidadDatos > 1000){
            System.out.println("El trafico es pesado");
        } else {
            System.out.println("El trafico es liviano");
        }
    }

    public boolean esCuelloBotella(){
        return this.duracion > 50;
    }

}
