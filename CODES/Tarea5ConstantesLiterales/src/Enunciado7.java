/*
7. Lee 9 enteros y muéstralos como una matriz 3×3, cada número con 3 dígitos y ceros a la izquierda:
007 045 120
000 008 999
010 010 001
* */

import java.util.Scanner;

public class Enunciado7 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.printf("INGRESAR NUMERO:");
        int num1 = sc.nextInt();

        System.out.printf("INGRESAR NUMERO:");
        int num2 = sc.nextInt();

        System.out.printf("INGRESAR NUMERO:");
        int num3 = sc.nextInt();

        System.out.printf("INGRESAR NUMERO:");
        int num4 = sc.nextInt();

        System.out.printf("INGRESAR NUMERO:");
        int num5 = sc.nextInt();

        System.out.printf("INGRESAR NUMERO:");
        int num6 = sc.nextInt();

        System.out.printf("INGRESAR NUMERO:");
        int num7 = sc.nextInt();

        System.out.printf("INGRESAR NUMERO:");
        int num8 = sc.nextInt();

        System.out.printf("INGRESAR NUMERO:");
        int num9 = sc.nextInt();

        System.out.printf("\n%03d %03d %03d\n" +
                          "%03d %03d %03d\n" +
                          "%03d %03d %03d\n", num1,num2,num3,num4,num5,num6,num7,num8,num9);

        sc.close();
    }
}
