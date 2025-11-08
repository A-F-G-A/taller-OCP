package Ejercicio_2;

public class MainDocumento {
    public static void main(String[] args) {
        Documento docPDF = new DocumentoPDF();
        Documento docWord = new DocumentoWord();

        String contenido = "Este es el contenido del documento.";

        docPDF.exportar(contenido);
        docWord.exportar(contenido);
    }
}