package ejercicio6;
import java.util.ArrayList;
import java.util.Collection;

public class Transacciones {

    private ArrayList<Transaccion> transacciones;

    public Transacciones() {
        this.transacciones = new ArrayList<>();
    }

    public void agregarTransaccion(Transaccion transaccion){
        this.transacciones.add(transaccion);
    }

    public void addTransaccion(boolean esFraudulento, int idTransaccion, double importe, String concepto, int idOrdenante, int idBeneficiario) {
        this.transacciones.add(new Transaccion(esFraudulento, idTransaccion, importe, concepto, idOrdenante, idBeneficiario));
    }

    public Collection<Transaccion> getTransacciones(){
        return this.transacciones;
    }

}
