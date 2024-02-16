package ejercicio11;
import java.util.*;

// Clase que genera patrones ASCII
public class GeneradorPatrones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el tipo de patron que desea generar: (rectangulo, triangulo, rombo)");
        String tipo = sc.nextLine();

        System.out.println("Ingrese el tamaño del patron");
        int tam = sc.nextInt();
        sc.nextLine();

        System.out.println("Ingrese el caracter que desea utilizar para el patron");
        char car = sc.nextLine().charAt(0);

        sc.close(); // Cerramos el scanner

        PatronesASCII.generarPatronASCII(tipo, tam, car);   // Llamada al metodo que genera el patron


    }
}
