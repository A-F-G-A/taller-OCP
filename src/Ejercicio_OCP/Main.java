package Ejercicio_OCP;

public class Main {
    public static void main(String[] args) {
        double precio = 100;

        Descuento descuento1 = new DescuentoPorcentaje(10);
        Descuento descuento2 = new DescuentoFijo(15);

        System.out.println("Precio con descuento por porcentaje: $" + descuento1.aplicarDescuento(precio));
        System.out.println("Precio con descuento fijo: $" + descuento2.aplicarDescuento(precio));
    }
}
