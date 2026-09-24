/*
 4. Pide nombre de sensor, lectura (double) y si está activo (boolean).
Muestra: Sensor: TEMP-1 Activo: true Lectura: 00023.50
• La lectura debe llevar ancho 5, 2 decimales y ceros delante para rellenar.
 * */

import java.util.Scanner;

public class Enunciado4 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("NOMBRE DEL SENSOR: ");
        String nombreSensor = sc.nextLine();

        System.out.println("LECTURA: ");
        float lecturaTemperatura = sc.nextFloat();

        System.out.println("ACTIVO: ");
        boolean activo = sc.nextBoolean();

        System.out.printf("Sensor: %s Activo: %b Lectura: %08.2f", nombreSensor, activo, lecturaTemperatura);

        sc.close();
    }
}
