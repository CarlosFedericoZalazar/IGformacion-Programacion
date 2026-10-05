/*
3. Crea un programa que reciba un número del 1 al 12 (mes del año) y diga a qué estación pertenece.
a) Usa multi-etiqueta en el switch (ej: case 12, 1, 2 -> "Invierno";).
* */

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("* Ingresar Mes: ");
        int mes = sc.nextInt();

        String estacion = switch (mes){
            case 3,4,5 -> "Primavera";
            case 6,7,8 -> "Verano";
            case 9,10,11-> "Otoño";
            case 12,1,2 -> "Invierno";
            default -> "mes inválido";
        };
        System.out.printf("\nEstación corresponde a %s", estacion);
    }
}
