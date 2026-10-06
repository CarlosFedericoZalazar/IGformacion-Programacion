/*
3. Pide números al usuario hasta que escriba 0. Muestra la suma total de todos los números introducidos.
* */

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean salida = false;
        int acc = 0;
        int numero;
        while (!salida){
            System.out.printf("Ingresar numero: ");
            numero = sc.nextInt();
            acc += numero;
            if(numero == 0) salida = true;
        }
        System.out.println(acc);
    }
}
