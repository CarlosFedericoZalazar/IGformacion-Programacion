/*
5. Pide un número del 1 al 7 y muestra el día de la semana correspondiente.*/

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean numeroOk;
        int numero;
        do{
            numeroOk = true;
            System.out.print("INGRESAR NUMERO (1-7): ");
            numero = sc.nextInt();
            if(numero < 1 || numero > 7){
                System.out.print("Error: el numero debe estar comprendido entre 1 y 7\n");
                numeroOk = false;
            }
        }while(!numeroOk);

        String diaSemana;
        if(numero == 1){
            diaSemana = "Lunes";
        } else if (numero == 2) {
            diaSemana = "Martes";
        } else if (numero == 3) {
            diaSemana = "Miercoles";
        } else if (numero == 4) {
            diaSemana = "Jueves";
        } else if (numero == 5) {
            diaSemana = "Viernes";
        } else if (numero == 6) {
            diaSemana = "Sabado";
        } else {
            diaSemana = "Domingo";
        }
        System.out.printf("\nEl dìa %d ingresado corresponde al %s", numero, diaSemana);
    }
}
