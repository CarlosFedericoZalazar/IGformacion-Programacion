/*  Aplicaciones
9. Una compañía tiene tres tipos de tarifa:
a) "TARIFA_PLANA" → 30 € fijos
b) "CONSUMO" → 0.15 € por kWh
c) "NOCTURNA" → 0.10 € por kWh si hora < 8 o > 22, si no 0.20 €
Escribe un programa que, dado el tipo de tarifa y el consumo (y hora del día para el último caso),
calcule el coste usando un switch.
* */

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el tipo de tarifa (TARIFA_PLANA, CONSUMO, NOCTURNA): ");
        String tarifa = sc.next().toUpperCase();

        System.out.print("Introduce el consumo en kWh: ");
        double consumo = sc.nextDouble();

        double coste = 0.0;

        switch (tarifa) {
            case "TARIFA_PLANA":
                coste = 30.0;
                break;
            case "CONSUMO":
                coste = consumo * 0.15;
                break;
            case "NOCTURNA":
                System.out.print("Introduce la hora del día (0-23): ");
                int hora = sc.nextInt();
                if (hora < 8 || hora > 22) {
                    coste = consumo * 0.10;
                } else {
                    coste = consumo * 0.20;
                }
                break;
            default:
                System.out.println("Error: Tipo de tarifa no válido.");
                return;
        }
        System.out.printf("El costo total de la factura es: %.2f €", coste);
        sc.close();
    }
}
