package ejercicio9;
import java.util.*;


public class ExpresionMatematica {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al programa de operaciones matemáticas");

        System.out.println("Desea realizar una operación matemática (1) o validar una expresión matemática (2)?");
        int opcion = sc.nextInt();
        sc.nextLine();

        // Si la opción es 1, se realiza la operación matemática, si es 2, se valida la expresión
        if (opcion == 1) {
            realizarOperaciones(sc);
        } else if (opcion == 2) {
            validarExpresion(sc);
        } else {
            System.out.println("Opción no válida");
        }


    }

    // Método que recibe dos valores y una operación y devuelve el resultado de la operación
    public static void realizarOperaciones(Scanner sc){
        System.out.println("Ingrese el primer valor (a)");


        int a = sc.nextInt();

        System.out.println("Ingrese el segundo valor (b)");
        int b = sc.nextInt();

        System.out.println("\nIndique la operacion que quiere realizar: suma, resta, multiplicación o división");
        System.out.println("Pulse 1 para suma, 2 para resta, 3 para multiplicación o 4 para división");

        int operacion = sc.nextInt();
        switch (operacion) {
            case 1:
                System.out.println("Indique la forma de hacer la suma:");
                String forma = sc.next();
                if (!forma.equalsIgnoreCase("a+b")) {
                    System.out.println("Incorrecto");
                    break;
                }

                System.out.println("Operación correcta. El resultado de la suma es: " + (a + b));
                break;
            case 2:
                System.out.println("Indique la forma de hacer la resta:");
                String forma2 = sc.next();
                if (!forma2.equalsIgnoreCase("a-b")) {
                    System.out.println("Incorrecto");
                    break;
                }
                System.out.println("Operación correcta. El resultado de la resta es: " + (a - b));
                break;
            case 3:
                System.out.println("Indique la forma de hacer la multiplicación:");
                String forma3 = sc.next();
                if (!forma3.equalsIgnoreCase("a*b")) {
                    System.out.println("Incorrecto");
                    break;
                }
                System.out.println("Operación correcta. El resultado de la multiplicación es: " + (a * b));
                break;
            case 4:
                System.out.println("Indique la forma de hacer la división:");
                String forma4 = sc.next();
                if (!forma4.equalsIgnoreCase("a/b")) {
                    System.out.println("Incorrecto");
                    break;
                }
                System.out.println("Operación correcta. El resultado de la división es: " + (a / b));
                break;
            default:
                System.out.println("Operación no válida");
        }
    }

    // Método que recibe una expresión matemática y devuelve si es válida o no
    public static void validarExpresion(Scanner sc){
        System.out.println("Ingrese la expresión matemática que desea validar");
        String expresion = sc.nextLine();
        Expresion exp = new Expresion(expresion);
        if (ValidadorExpresiones.esValida(exp)) {
            System.out.println("La expresión es válida");
        } else {
            System.out.println("La expresión no es válida");
        }
    }

}

