package ejercicio4;

public class AsistenteVirtual {
    public static void main(String[] args) {
        // Instanciamos las clases necesarias
        InteraccionUsuario interaccionUsuario = new InteraccionUsuario();
        ProcesarSolicitud procesador = new ProcesarSolicitud();
        // Ciclo que permite la interacción con el usuario
        while (true) {
            String solicitud = interaccionUsuario.obtenerSolicitud();
            String respuesta = procesador.procesarSolicitud(solicitud);
            System.out.println("Asistente: " + respuesta);
        }
    }
}