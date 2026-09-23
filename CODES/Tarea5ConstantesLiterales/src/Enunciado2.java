/*
2. Pide un número de pedido (entero) y una letra de serie (carácter). Muestra: Serie: A ID: 00042
• El ID debe ir relleno con ceros a 5 dígitos.
* */

import java.util.Scanner;

public class Enunciado2 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("INGRESE NUMERO DE PEDIDO: ");
        int pedido = sc.nextInt();

        System.out.print("INGRESE UN LETRA SERIE: ");
        char letraSerie = sc.next().charAt(0);

        System.out.printf("Serie %c ID: %05d", letraSerie, pedido);

    }
}
