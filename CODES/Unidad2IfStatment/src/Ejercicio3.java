/*
3. Pide un número al usuario y muestra si es par o impar.
* */

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("INGRESAR NUMERO: ");
        int numero = sc.nextInt();

        String mensaje = (numero%2 ==0) ? "ES PAR" : "ES IMPAR";

        System.out.printf("\nNUMERO INGRESADO %d es %s", numero, mensaje);
    }
}
