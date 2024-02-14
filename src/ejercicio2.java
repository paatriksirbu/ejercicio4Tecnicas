import java.util.*;

class Red{
    List<Dispositivo> dispositivos = new ArrayList<>();

    public Red() {
        this.dispositivos = new ArrayList<>();
    }

    public void agregarDispositivo(Dispositivo dispositivo){
        dispositivos.add(dispositivo);
    }
}

abstract class Dispositivo{     //quiero routers, switches, computadoras, impresoras
    String nombre;

    public Dispositivo(String nombre) {
        this.nombre = nombre;
    }
}

class Router extends Dispositivo{
    public Router(String nombre) {
        super(nombre);
    }
}

class Switch extends Dispositivo{
    public Switch(String nombre) {
        super(nombre);
    }
}

class Computadora extends Dispositivo{
    public Computadora(String nombre) {
        super(nombre);
    }
}


public class ejercicio2 {

    public static void main(String[] args) {

    }

}

