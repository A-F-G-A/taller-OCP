package Ejercicio_2;

//exportar a Word
public class DocumentoWord extends Documento {
    @Override
    public void exportar(String contenido) {
        System.out.println("Exportando contenido a Word: " + contenido);
    }
}
