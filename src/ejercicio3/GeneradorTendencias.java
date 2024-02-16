package ejercicio3;

public class GeneradorTendencias {

    public static Tendencias generarColeccionTendencias() {
        // Crear una colección de tendencias
        Tendencias tendencias = new Tendencias();

        tendencias.addTendencia("Challenge de baile", 500000, "TikTok", "Entretenimiento", 14);
        tendencias.addTendencia("Recetas saludables", 300000, "Instagram", "Alimentación", 30);
        tendencias.addTendencia("Tutoriales de maquillaje", 200000, "YouTube", "Belleza", 21);
        tendencias.addTendencia("Memes de políticos", 400000, "Twitter", "Humor", 7);
        tendencias.addTendencia("Rutinas de ejercicios en casa", 350000, "Instagram", "Fitness", 60);
        tendencias.addTendencia("Reseñas de libros", 150000, "TikTok", "Cultura", 21);
        tendencias.addTendencia("Consejos de sostenibilidad", 250000, "Instagram", "Medio ambiente", 28);
        tendencias.addTendencia("Tutoriales de programación", 100000, "YouTube", "Educación", 30);
        tendencias.addTendencia("Fotografía de viajes", 300000, "Instagram", "Viajes", 14);
        tendencias.addTendencia("Análisis de videojuegos", 220000, "Twitter", "Gaming", 7);

        return tendencias;
    }
}
