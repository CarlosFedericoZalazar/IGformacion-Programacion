/*
2. Pide al usuario una letra (A, B, C, D, E, F) e imprime el número de puntos equivalente (A → 10, B → 8, etc.).
a) Hazlo con switch expression que devuelva directamente un entero.
*/

import java.util.Scanner;
public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresar Letra");
        String letra = sc.nextLine().toUpperCase();

        int numero = switch (letra){
            case "A" -> 10;
            case "B" -> 8;
            case "C" -> 12;
            case "D" -> 14;
            default -> -1;
        };

        String mensaje = numero == -1 ? "VALOR INGRESADO INVALIDO" : "Valor ingresado: " + numero;
        System.out.println(mensaje);
    }
}
