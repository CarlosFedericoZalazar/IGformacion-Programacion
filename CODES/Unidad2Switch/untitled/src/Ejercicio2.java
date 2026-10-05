/*
2. Pide al usuario una letra (A, B, C, D, E, F) e imprime el número de puntos equivalente (A → 10, B → 8, etc.).
a) Hazlo con switch expression que devuelva directamente un entero.
* */

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("INGRESAR LETRA (A,B,C,D,E,F): ");
        char letra = sc.next().charAt(0);
        char letraMayuscula = Character.toUpperCase(letra);

        int numero = switch (letraMayuscula){
            case 'A' -> 10;
            case 'B' -> 8;
            case 'C' -> 6;
            case 'D' -> 4;
            case 'E' -> 2;
            case 'F' -> 0;
            default -> -1;
        };
        String mensaje = "NUMERO CORRESPONDINETE: ";
        mensaje += numero == -1 ? "Invalido" : ""+numero;
        System.out.printf("\n%s", mensaje);
    }
}
