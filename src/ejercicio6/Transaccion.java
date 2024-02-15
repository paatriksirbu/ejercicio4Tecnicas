package ejercicio6;

public class Transaccion {
    private boolean esFraudulento;



    private int idTransaccion;
    private double  importe;
    private String concepto;
    private int idOrdenante;
    private int idBeneficiario;


    public Transaccion(boolean esFraudulento, int idTransaccion, double importe, String concepto, int idOrdenante, int idBeneficiario) {
        this.esFraudulento = esFraudulento;
        this.idTransaccion = idTransaccion;
        this.importe = importe;
        this.concepto = concepto;
        this.idOrdenante = idOrdenante;
        this.idBeneficiario = idBeneficiario;
    }

    public void marcarComoFraudulenta(){
        this.setEsFraudulento(true);
    }

    private void setEsFraudulento(boolean esFraudulento) {
        this.esFraudulento = esFraudulento;
    }

    public double getImporte() {
        return importe;
    }

    public boolean isEsFraudulento() {
        return esFraudulento;
    }
}
