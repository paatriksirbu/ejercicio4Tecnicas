package ejercicio9;

public class ValidadorExpresiones {
    // Método que recibe una expresión matemática y devuelve true si es válida y false si no lo es

    public static boolean esValida(Expresion expresion){
        return comprobarSintaxis(expresion.getExpresion()) && comprobarParentesis(expresion.getExpresion());
    }


    private static boolean comprobarSintaxis(String expresion) {
        expresion = expresion.replaceAll("\\s", "");

        if (!expresion.matches("[0-9+\\-*/()]+")) {
            return false;
        }

        if (expresion.matches("^[+\\-*/].*|.*[+\\-*/]$")) {
            return false;
        }

        if (expresion.matches(".*[+\\-*/]{2,}.*") && !expresion.matches(".*\\d-[0-9].*")) {
            return false;
        }

        return true;
    }

    private static boolean comprobarParentesis(String expresion){   // Método que comprueba que los paréntesis estén balanceados
        int balance = 0;
        for (int i = 0; i < expresion.length(); i++) {
            char c = expresion.charAt(i);
            if (c == '(') {
                balance++;
            } else if (c == ')') {
                balance--;
                if (balance < 0) {
                    return false;
                }
            }
        }
        return balance == 0;
    }
}
