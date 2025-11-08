package Ejercicio_2;


//exportar a PDF
public class DocumentoPDF extends Documento {
    @Override
    public void exportar(String contenido) {
        System.out.println("Exportando contenido a PDF: " + contenido);
    }
}
