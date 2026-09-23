/*
*1. Pide al usuario:
• Su nombre (String).
• Su edad (int).
• Si le gusta la programación (boolean).
• Después imprime un mensaje personalizado mostrando la información introducida.
* */

import java.util.Scanner;

public class Enunciado1 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("NOMBRE: ");
        String nombre = sc.nextLine();

        System.out.println("EDAD: ");
        int edad = sc.nextInt();

        System.out.println("LE GUSTA LA PROGRAMACION: ");
        boolean gustaOk = sc.nextBoolean();

        System.out.printf("NOMBRE: %s\nEDAD: %d\n¿GUSTA PROGRAMAR?: %b",nombre, edad, gustaOk);
        sc.close();
    }
}
