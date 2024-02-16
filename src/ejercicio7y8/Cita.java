package ejercicio7y8;
public class Cita {
    private String autor;
    private String cita;
    private String contexto;

    public Cita(String autor, String cita, String contexto) {
        this.autor = autor;
        this.cita = cita;
        this.contexto = contexto;
    }

    public String getAutor() {
        return autor;
    }

    public String getCita() {
        return cita;
    }

    public String getContexto() {
        return contexto;
    }

    @Override
    public String toString() {
        return cita + "-" + autor;
    }
}
