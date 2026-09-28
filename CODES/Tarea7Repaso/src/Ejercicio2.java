/*
2. Crea un programa de conversión de monedas de euros a otras monedas. Sabemos que el cambio al dólar es de 1,08,
el cambio de la libra es de 0,86 y el del yen es de 161,5. El programa debe:
• Pedir al usuario una cantidad en euros.
• Calcular el valor equivalente en dólares, libras y yenes.
*/
import java.util.Scanner;

public class Ejercicio2 {
    public static void main (String[] args){
        final float CAMBIO_DOLAR = 1.08f;
        final float CAMBIO_LIBRA = 0.86f;
        final float CAMBIO_YEN = 161.5f;

        Scanner sc = new Scanner(System.in);
        System.out.printf("* EURO: ");
        float euro = sc.nextFloat();

        float dolar = euro * CAMBIO_DOLAR;
        float libra = euro * CAMBIO_LIBRA;
        float yen = euro * CAMBIO_YEN;

        System.out.printf("Cantidad en euros: %.2f €\nEn dólares: %.2f $\n" +
                          "En libras: %.2f £\nEn yenes: %.2f ¥", euro, dolar, libra, yen);
    }
}
