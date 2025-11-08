package Ejercicio_3;

public class MainMensajero {

    public static void main(String[] args) {
    Mensaje mensajeEmail = new MensajeEmail();
    Mensaje mensajeSMS = new MensajeSMS();

    mensajeEmail.enviarMensaje("Am@gmail.es", "Hola, este es un mensaje de prueba por Email.");
    mensajeSMS.enviarMensaje("3054501234567", "Hola, este es un mensaje de prueba por SMS.");

}
}


