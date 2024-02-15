package ejercicio6;

public class GeneradorTransaccionesAleatorias {

    public static Transacciones generarColeccionTransacciones() {
        Transacciones transacciones = new Transacciones();
        for (int i = 0; i < 10; i++){
            boolean esFraudulenta = Math.random() < 0.5;
            transacciones.addTransaccion(esFraudulenta, i, Math.random() * 1000, "Concepto" + i, i, 100+i);
        }
        return transacciones;
    }
}
