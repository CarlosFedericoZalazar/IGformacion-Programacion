/*
3. Pide números al usuario hasta que escriba 0. Muestra la suma total de todos los números introducidos.
* */

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int acc = 0;

        System.out.print("Ingresar numero: ");
        int numero = sc.nextInt();

        while (numero != 0) {
            acc += numero;
            System.out.print("Ingresar numero: ");
            numero = sc.nextInt();
        }
        System.out.println("La suma total es: " + acc);
        sc.close();
    }
}
