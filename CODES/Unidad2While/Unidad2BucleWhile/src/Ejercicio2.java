/*
2. Pide al usuario un número y muestra una cuenta atrás desde ese número hasta 0.
* */

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Número: ");
        int mumero = sc.nextInt();

        while(mumero!=0){
            System.out.printf("%d ", mumero--);
        }
    }
}
