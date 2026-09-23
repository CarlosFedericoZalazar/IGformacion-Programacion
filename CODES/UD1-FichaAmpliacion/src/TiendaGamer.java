/*
Crea una clase llamada TiendaGamer, los datos estarán escritos directamente en variables. Tu
programa debe calcular el precio de un pequeño pedido.

• Calcula el subtotal de los productos antes del envío.
• Calcula cuánto dinero representa el descuento del 10 %.
• Calcula el total final (contando con el envío).
• Muestra todo lo que hemos calculado.
• Crea además una variable int llamada eurosEnteros que guarde solo la parte entera del total mediante
casting

* */

public class TiendaGamer {
    public static void main(String[] args){
        double precioJuego = 39.95;
        int unidadesJuego = 2;
        double precioMando = 54.90;
        double envio = 4.99;
        double descuento = 10; // porcentaje

        double subTotal = precioJuego * unidadesJuego + precioMando;
        double dineroDescuento = (subTotal * descuento) / 100;
        double totalFinal = subTotal - dineroDescuento + envio;

        int eurosEntero = (int)totalFinal;

        System.out.println(subTotal);
        System.out.println(dineroDescuento);
        System.out.println(totalFinal);
        System.out.println(eurosEntero);


    }
}
