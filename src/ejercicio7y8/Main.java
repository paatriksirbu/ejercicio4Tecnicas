package ejercicio7y8;

import java.util.Random;
import java.util.Scanner;

public class Main {
    final static BaseDatos BDD = new BaseDatos();   // Instancia de la base de datos
    public static void main(String[] args) {

        boolean continuar = true;   // Variable para controlar el flujo del programa
        do {
            int c = obtenerCitaAleatoria();
            generarCita(c);
            esperarSolicitudParaNuevaCita(continuar);
        } while (continuar);
    }
// Metodo para generar una cita aleatoria
    public static void generarCita(int random){
        String cita = BDD.getBDD().get(random).toString();
        System.out.println("Cita Inspiradora: " + cita);
    }
// Metodo para obtener una cita aleatoria
    public static int obtenerCitaAleatoria(){
        Random rndm = new Random();
        int r = rndm.nextInt(BDD.getBDD().size());
        return r;
    }
    // Metodo para esperar la solicitud de una nueva cita
    public static void esperarSolicitudParaNuevaCita(boolean continuar){

        System.out.println("Desea usted obtener otra cita inspiradora? (y/n)");
        char respuesta = new Scanner(System.in).next().charAt(0);

        if (respuesta == 'n'){
            continuar = false;
            System.out.println("Nos vemos pronto!");
            System.exit(0);
        } else if (respuesta == 'y') {
            continuar = true;
        } else{
            System.out.println("Ha sucedido un error");
            System.exit(0);
        }

    }
}
