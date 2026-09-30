/*
2. Escribe un programa que lea un número y muestre "Positivo" si el número es mayor que 0.
*/

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("NUMERO A EVALUAR: ");
        int numero = sc.nextInt();

        String mensaje = (numero > 0) ? "POSITIVO" : "NO POSITIVO";
        System.out.printf("EL NUMERO INGRESADO ES: %s", mensaje);
    }
}
