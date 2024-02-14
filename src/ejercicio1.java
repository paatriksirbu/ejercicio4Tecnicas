import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


public class ejercicio1 {

    private static final List<String> palabrasPos = Arrays.asList("feliz", "genial", "fantástico", "positivo", "amor");
    private static final List<String> palabrasNeg = Arrays.asList("triste", "horrible", "negativo", "odio", "malo");

    public static void analizarComentarios(List<String> comentarios) {
        for (String comentario : comentarios) {
            String sentimiento = determinarSentimiento(comentario, palabrasPos, palabrasNeg);
            if (comentario.contains("error")) {
                System.out.println("Error encontrado: " + comentario);
            }
            System.out.println("El sentimiento del comentario es: " + comentario + " es: " + sentimiento);
        }
    }

    public static String determinarSentimiento(String comentario, List<String> palabrasPos, List<String> palabrasNeg) {

        boolean esPositivo = palabrasPos.stream().anyMatch(comentario::contains);
        boolean esNegativo = palabrasNeg.stream().anyMatch(comentario::contains);

        if (esPositivo) {
            return "positivo";
        } else if (esNegativo) {
            return "negativo";
        } else {
            return "neutro";
        }

    }


    public static void main(String[] args) {
        List<String> comentarios = Arrays.asList("Me siento feliz", "Me siento triste", "Me siento genial", "Me siento horrible", "Me siento fantástico", "Me siento negativo", "Me siento positivo", "Me siento odio", "Me siento amor", "Me siento malo", "Me siento neutro", "Me siento error");

        analizarComentarios(comentarios);
    }
}


