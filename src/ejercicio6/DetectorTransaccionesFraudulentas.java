package ejercicio6;

import java.util.ArrayList;

public class DetectorTransaccionesFraudulentas {

    private Transacciones transacciones;

    public DetectorTransaccionesFraudulentas(Transacciones transacciones) {
        this.transacciones = GeneradorTransaccionesAleatorias.generarColeccionTransacciones();
    }

    public void detectarTransaccionesFraudulentas() {
        for (Transaccion transaccion : transacciones.getTransacciones()) {
            if (transaccion.getImporte() > 1000) {
                transaccion.marcarComoFraudulenta();
            }
        }
    }
}
