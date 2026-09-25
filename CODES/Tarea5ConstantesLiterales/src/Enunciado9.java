/*
9. Pide dos números decimales y muestra:
• La suma alineada en un campo de 10 posiciones y 3 decimales.
• La misma suma alineada a la izquierda.
 */

import java.util.Scanner;

public class Enunciado9 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.printf("PRIMER NUMERO: ");
        double num1 = sc.nextDouble();
        System.out.printf("SEGUNDO NUMERO: ");
        double num2 = sc.nextDouble();

        System.out.printf("\nSUMA ALINEADA 10 POSICIONES\n");
        System.out.printf("%10.3f", (num1+num2));
        System.out.printf("\nSUMA ALINEADA A LA IZQUIERDA\n");
        System.out.printf("%-10.3f", (num1+num2));

    }
}
