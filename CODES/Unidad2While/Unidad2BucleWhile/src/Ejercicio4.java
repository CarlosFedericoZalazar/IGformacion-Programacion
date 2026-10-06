/*
4. Pide al usuario un número positivo. Si introduce un número negativo o 0, vuelve a pedirlo hasta que cumpla la condición.
* */

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("INGRESAR NUMERO POSITIVO: ");
        int numero = sc.nextInt();

        while (numero <= 0) {
            System.out.print("INGRESAR NUMERO POSITIVO: ");
            numero = sc.nextInt();
        }

        System.out.println("Número válido ingresado: " + numero);
        sc.close();
    }
}
