package ejercicio7y8;
import java.util.*;

public class MainContexto {

    final static BaseDatos BDD = new BaseDatos();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        while (continuar) {
            String contexto = obtenerContexto(sc);
            generarCitaContexto(contexto);
            continuar = esperarSolicitudParaNuevaCita(sc);

        }
        sc.close();

    }

    // Metodo para obtener las citas de un contexto
    public static List<Cita> obtenerCitasContexto(String contexto){
        List<Cita> citasFiltradas = new ArrayList<Cita>();
        for (Cita cita : BDD.getBDD()) {
            if (cita.getContexto().equalsIgnoreCase(contexto)) {
                citasFiltradas.add(cita);
            }
        }
        return citasFiltradas;
    }

    // Metodo para generar una cita aleatoria de un contexto
    public static void generarCitaContexto(String contexto) {
        List<Cita> citasFiltradas = obtenerCitasContexto(contexto);
        if (!citasFiltradas.isEmpty()) {
            int r = obtenerCitaAleatoria(citasFiltradas.size());
            generarCita(citasFiltradas.get(r));
        } else {
            System.out.println("Lo siento, no hay citas disponibles para este contexto.");
        }
    }
    // Metodo para obtener el contexto de la cita
    public static String obtenerContexto(Scanner sc){
        System.out.println("Introduce el contexto de la cita que quieres obtener (Motivacion, Inspiracion, Ciencia, Reflexion, Exploracion)");
        return sc.nextLine();
    }

    public static void generarCita(Cita cita){
        System.out.println("Cita: " + cita);
    }

    // Metodo para esperar la solicitud de una nueva cita
    public static boolean esperarSolicitudParaNuevaCita(Scanner sc){

        System.out.println("Desea usted obtener otra cita inspiradora? (y/n)");
        String respuesta = sc.nextLine();

        if (respuesta.equalsIgnoreCase("n")){
            System.out.println("Nos vemos pronto!");
            return false;
        } else if (respuesta.equalsIgnoreCase("y")) {
            return true;
        } else{
            System.out.println("Ha sucedido un error");
            return esperarSolicitudParaNuevaCita(sc);
        }

    }
    // Metodo para obtener una cita aleatoria
    public static int obtenerCitaAleatoria(int max){
        Random rand = new Random();
        return rand.nextInt(max);
    }


}
