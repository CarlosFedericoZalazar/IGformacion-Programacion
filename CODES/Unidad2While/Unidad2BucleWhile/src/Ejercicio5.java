// 5. Pide al usuario un número y calcula su factorial con un while.

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("INGRESE EL NUMERO: ");
        int numero = sc.nextInt();
        int i = 0;
        int factorial = 1;
        while (i < numero){
            factorial *= numero;
            i++;
        }

        System.out.printf("Factorial de %d es %d", numero, factorial);
    }
}
