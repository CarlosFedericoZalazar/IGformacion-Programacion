/*
5. Imprime tres apuntes (texto + importe). Los negativos deben verse entre paréntesis
y con separador de miles:
Nóminas      (12,345.67)
Ventas       230,000.00
Suministros  (450.00)

• Para el importe: 15 de ancho, separador de miles y negativos entre paréntesis.
• Concepto alineado a la izquierda y ancho de 18.
* * */

import java.util.Scanner;

public class Enunicado5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("NOMINAS: ");
        double montoNominas = sc.nextDouble();

        System.out.print("Ventas: ");
        double montoVentas = sc.nextDouble();

        System.out.print("Suministro: ");
        double montoSuministro = sc.nextDouble();

        System.out.println("\n--- RESULTADO ---");

        System.out.printf("%-18s %(,15.2f\n", "Nóminas", montoNominas);
        System.out.printf("%-18s %(,15.2f\n", "Ventas", montoVentas);
        System.out.printf("%-18s %(,15.2f\n", "Suministros", montoSuministro);

        sc.close();
    }
}


