package Ejercicio_3;

//Enviar mensaje por Email
public class MensajeEmail extends Mensaje {
    @Override
    public void enviarMensaje(String destinatario, String contenido) {
        System.out.println("Enviando Email a " + destinatario + " con el contenido: " + contenido);
    }
}