// 6. Pide un número al usuario y muestra su tabla de multiplicar del 1 al 10.
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("INGRESE UN NUMERO: ");
        int numero = sc.nextInt();

        int multiplicador = 1;
        System.out.printf("\n-- TABLA DE %d-- \n", numero);
        while(multiplicador <= 10){
            System.out.printf("* %d X %d = %d\n", numero, multiplicador, numero * multiplicador);
            multiplicador++;
        }
    }
}
