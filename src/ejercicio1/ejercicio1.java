package ejercicio1;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


public class ejercicio1 {

    private static final List<String> palabrasPos = Arrays.asList("feliz", "genial", "fantástico", "positivo", "amor");
    private static final List<String> palabrasNeg = Arrays.asList("triste", "horrible", "negativo", "odio", "malo");

    // Método que recibe una lista de comentarios y determina el sentimiento de cada uno
    public static void analizarComentarios(List<String> resenias) {
        for (String resenia : resenias) { // Iteramos sobre cada comentario
            String sentimiento = determinarSentimiento(resenia, palabrasPos, palabrasNeg);   // Determinamos el sentimiento del comentario
            if (resenia.contains("error")) {
                System.out.println("Error encontrado: " + resenia);
            }
            System.out.println("El sentimiento de la resenia es: " + resenia + " es: " + sentimiento);
        }
    }
    // Método que recibe un comentario y determina si es positivo, negativo o neutro
    public static String determinarSentimiento(String resenia, List<String> palabrasPos, List<String> palabrasNeg) {

        // Verificamos si el comentario contiene alguna palabra positiva o negativa de las que hemos declarado en la Lista
        boolean esPositivo = palabrasPos.stream().anyMatch(resenia::contains);
        boolean esNegativo = palabrasNeg.stream().anyMatch(resenia::contains);

        if (esPositivo) {
            return "positivo";
        } else if (esNegativo) {
            return "negativo";
        } else {
            return "neutro";
        }

    }

    public static void main(String[] args) {    // Método principal
        List<String> resenias = Arrays.asList("Este producto es fantástico, realmente me ha cambiado la vida",
                "Me siento decepcionado, el producto no cumplió mis expectativas",
                "Increíble calidad, amor a primera vista",
                "El peor producto que he comprado, horrible experiencia",
                "Estoy feliz con mi compra, fue una excelente decisión",
                "Genial, el producto llegó a tiempo y en perfecto estado",
                "Sentimientos encontrados, por un lado me gusta pero esperaba más",
                "Pura decepción, me siento estafado",
                "Un producto positivo, cumple lo que promete",
                "Ojalá no lo hubiera comprado, odio cómo funciona",
                "No está mal, pero tampoco es nada del otro mundo, bastante neutro");   //Lista de resenias

        analizarComentarios(resenias);   // Llamamos al método analizarComentarios y le pasamos la lista de comentarios
    }
}


