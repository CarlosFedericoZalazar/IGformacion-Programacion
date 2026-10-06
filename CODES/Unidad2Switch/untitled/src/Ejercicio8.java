/*
8. Pide por teclado un color en un String y utiliza un switch expression que devuelva una acción:
a) ROJO -> "Detente"
b) AMARILLO -> "Precaución"
c) VERDE -> "Avanza"
* */

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un color del semáforo (ROJO, AMARILLO, VERDE): ");
        String color = teclado.nextLine().toUpperCase();

        String accion = switch (color) {
            case "ROJO" -> "Detente";
            case "AMARILLO" -> "Precaución";
            case "VERDE" -> "Avanza";
            default -> "Color no válido";
        };

        System.out.println(accion);

        teclado.close();
    }
}
