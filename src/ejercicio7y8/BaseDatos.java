package ejercicio7y8;
import java.util.*;

public class BaseDatos {

    private List<Cita> citas;

    public BaseDatos() {
        citas = new ArrayList<Cita>();

        citas.add(new Cita("Albert Einstein", "La vida es como andar en bicicleta. Para mantener el equilibrio, debes seguir adelante.", "En una carta a su hijo Eduard"));
        citas.add(new Cita("Isaac Newton", "Si he logrado ver más lejos, ha sido porque he subido a hombros de gigantes.", "En una carta a Robert Hooke"));
        citas.add(new Cita("Galileo Galilei", "E pur si muove.", "En una carta a Benedetto Castelli"));
        citas.add(new Cita("Nikola Tesla", "Si quieres encontrar los secretos del universo, piensa en términos de energía, frecuencia y vibración.", "En una entrevista"));
        citas.add(new Cita("Marie Curie", "Nada en la vida debe ser temido, solo comprendido. Ahora es el momento de comprender más, para que temamos menos.", "En una conferencia"));
        citas.add(new Cita("Stephen Hawking", "La vida sería trágica si no fuera graciosa.", "En una entrevista"));
        citas.add(new Cita("Richard Feynman", "La imaginación de la naturaleza es mucho, mucho mayor que la imaginación del hombre.", "En una conferencia"));
        citas.add(new Cita("Carl Sagan", "Somos una forma de que el cosmos se conozca a sí mismo.", "En una entrevista"));
        citas.add(new Cita("Neil deGrasse Tyson", "La buena ciencia es simplemente el aprendizaje de la realidad. La buena religión es simplemente la apreciación de la realidad.", "En una entrevista"));
    }

    public List<Cita> getBDD() {
        return citas;
    }

    public void addCita(Cita cita) {
        citas.add(cita);
    }
}
