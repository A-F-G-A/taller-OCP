package Ejercicio_3;

//Enviar mensaje por SMS
public class MensajeSMS extends Mensaje {
    @Override
    public void enviarMensaje(String destinatario, String contenido) {
        System.out.println("Enviando SMS a " + destinatario + " con el contenido: " + contenido);
    }
}