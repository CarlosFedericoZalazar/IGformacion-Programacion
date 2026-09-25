/*
6. Para cada corredor, muestra nombre, tiempo final y mejora respecto a su marca anterior:
 Nombre      Tiempo    Mejora
 Ana Pérez   42.35     +1.20
 Luis Gómez  39.80     -0.45

• Nombre: ancho 16.
• Tiempo: 2 decimales y ancho 7.
• Mejora: ancho 6 y signo obligatorio.
*/

import java.util.Scanner;

public class Enunciado6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("NOMBRE CORREDOR: ");
        String corredorUno = sc.nextLine();

        System.out.println("TIEMPO: ");
        float tiempoUno = sc.nextFloat();

        System.out.println("MEJORA: ");
        float mejoraUno = sc.nextFloat();

        sc.nextLine();

        System.out.println("NOMBRE CORREDOR: ");
        String corredorDos = sc.nextLine();

        System.out.println("TIEMPO: ");
        float tiempoDos = sc.nextFloat();

        System.out.println("MEJORA: ");
        float mejoraDos = sc.nextFloat();

        System.out.printf("%-16s  tiempo  Mejora\n", "Nombre");
        System.out.printf("%-16s %7.2f %+6.2f\n", corredorUno, tiempoUno, mejoraUno);
        System.out.printf("%-16s %7.2f %+6.2f", corredorDos, tiempoDos, mejoraDos);

        sc.close();
        
    }
}
