//10. Pide dos números y muestra si ambos son pares, si alguno es par, o si ninguno es par.

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] argsg){
        Scanner sc = new Scanner(System.in);
        String mensaje;

        System.out.printf("Ingresar Numero 1: ");
        int numero1 = sc.nextInt();

        System.out.printf("Ingresar Numero 2: ");
        int numero2 = sc.nextInt();

        if(numero1 % 2 == 0 && numero2 % 2 == 0){
            mensaje = "AMBOS SON PARES";
        }else {
            mensaje = numero1 % 2 == 0 || numero2 % 2 == 0 ? "UNO DE LOS DOS NUMEROS ES PAR" : "NINGUNO ES PAR";
        }
        System.out.printf(mensaje);
    }
}
