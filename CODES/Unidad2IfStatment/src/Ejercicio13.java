/*
 13. Simula un cajero automático (crea un PIN de 4 dígitos):
 a) Pide al usuario el PIN (4 dígitos).
 b) Si es correcto (coincide con el que has creado), permite elegir entre “Consultar saldo” y “Retirar dinero”.
 c) Si no, muestra "PIN incorrecto".
 */

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("CREAR PIN: ");
        String newPin = sc.nextLine();

        System.out.print("INGRESAR PIN: ");
        String pinUser = sc.nextLine();

        if(pinUser.equals(newPin)){
            System.out.println("\n1. Consultar Saldo");
            System.out.println("2. Retirar dinero");
        }else{
            System.out.printf("2. Pin incorrecto");
        }

    }
}
