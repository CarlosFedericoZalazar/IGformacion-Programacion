/*
3. Pide una temperatura de hoy y una que sea la media histórica.
Muestra dos líneas: Diferencia (con +): +3 Diferencia (sin signo): 3
* */

import java.util.Scanner;

public class Enunciado3 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("INGRESAR TEMPERATURA: ");
        float temp = sc.nextFloat();

        System.out.print("INGRESAR TEMPERATURA HISTORICA: ");
        float tempHistorica = sc.nextFloat();

        float diferencia = temp - tempHistorica;

        System.out.printf("Diferencia: %+.2f\nDiferencia: %.2f", diferencia, diferencia);

        sc.close();

    }
}
