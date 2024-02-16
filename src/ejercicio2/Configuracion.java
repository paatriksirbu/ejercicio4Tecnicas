package ejercicio2;
import java.util.List;
import java.util.Scanner;

class Configuracion {

    private List<Dispositivo> dispositivos;
    int cantidadRouters;
    int cantidadSwitches;
    int cantidadComputadoras;


    public Configuracion() {
        this.dispositivos = dispositivos;
    }

    public List<Dispositivo> getDispositivos() {
        return dispositivos;
    }



    public int getCantidadRouters() {
        return cantidadRouters;
    }

    public void setCantidadRouters(int cantidadRouters) {
        this.cantidadRouters = cantidadRouters;
    }

    public int getCantidadSwitches() {
        return cantidadSwitches;
    }

    public void setCantidadSwitches(int cantidadSwitches) {
        this.cantidadSwitches = cantidadSwitches;
    }

    public int getCantidadComputadoras() {
        return cantidadComputadoras;
    }

    public void setCantidadComputadoras(int cantidadComputadoras) {
        this.cantidadComputadoras = cantidadComputadoras;
    }

    public static Configuracion obtenerConfigUsuario(){
        Scanner scanner = new Scanner(System.in);

        Configuracion configuracion = new Configuracion();

        System.out.println("Vamos a obtener la configuracion del usuario.");
        System.out.println("Ingrese la cantidad de routers que desea: ");
        int cantidadRouters = scanner.nextInt();
        System.out.println("Ingrese la cantidad de switches que desea: ");
        int cantidadSwitches = scanner.nextInt();
        System.out.println("Ingrese la cantidad de computadoras que desea: ");
        int cantidadComputadoras = scanner.nextInt();

        configuracion.generarDispositivos();

        System.out.println("La configuracion ha sido guardada correctamente.");
        return new Configuracion();
    }

    public void generarDispositivos(){
        for (int i = 0; i < cantidadRouters; i++) {
            dispositivos.add(new Router("Router" + i));
        }
        for (int i = 0; i < cantidadSwitches; i++) {
            dispositivos.add(new Switch("Switch" + i));
        }
        for (int i = 0; i < cantidadComputadoras; i++) {
            dispositivos.add(new Computadora("Computadora" + i));
        }
    }
}

