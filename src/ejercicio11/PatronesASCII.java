package ejercicio11;

public class PatronesASCII {
    public static void generarPatronASCII(String tipo, int tam, char car){
        crearPatron(tipo, tam, car);
    }

    // Metodo para crear el patron
    private static void crearPatron(String tipo, int tam, char car){
        switch(tipo.toLowerCase()){
            case "rectangulo":  // Si el tipo de patron es un rectangulo se ejecuta este bloque de codigo

                for (int i = 0; i < tam; i++) {
                    for (int j = 0; j < tam * 2; j++) {
                        System.out.print(car);
                    }
                    System.out.println();
                }
               break;
            case "triangulo":   // Si el tipo de patron es un triangulo se ejecuta este bloque de codigo
                for (int i = 0; i < tam; i++) {
                    for (int j = 0; j <= i; j++) {
                        System.out.print(car);
                    }
                    System.out.println();
                }
                break;
            case "rombo":   // Si el tipo de patron es un rombo se ejecuta este bloque de codigo
                // Parte superior del rombo
                for (int i = 1; i <= tam; i++) {
                    for (int j = tam; j > i; j--) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= (2 * i - 1); j++) {
                        System.out.print(car);
                    }
                    System.out.println();
                }
                // Parte inferior del rombo
                for (int i = tam - 1; i > 0; i--) {
                    for (int j = tam; j > i; j--) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= (2 * i - 1); j++) {
                        System.out.print(car);
                    }
                    System.out.println();
                }
                break;
            default:
                System.out.println("El tipo de patron ingresado no es valido");
        }
    }

    private static void mostrarPatron(String patron){   // Metodo para mostrar el patron
        System.out.println(patron);
    }
}
