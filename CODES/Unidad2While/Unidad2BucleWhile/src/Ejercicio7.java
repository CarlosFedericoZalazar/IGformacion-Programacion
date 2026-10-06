/*
7. El programa genera un número aleatorio entre 1 y 100. El usuario debe adivinarlo. El bucle se repite hasta que
 lo acierte, indicando si el número es mayor o menor.
Para generar un número aleatorio, utiliza:
Random r = new Random();
int num = r.nextInt(100) + 1; // de 1 a 100 // nextInt(100) genera [0,99]; al sumar 1 obtenemos [1,100]*/

import java.util.Random;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Random r = new Random();
        int numero = r.nextInt(101);
        boolean founded = false;
        int contador = 0;

        while(!founded){
            System.out.printf("INGRESAR NUMERO: ");
            int numeroIngresado = sc.nextInt();

            if(numeroIngresado != numero){
                if(numero > numeroIngresado){
                    System.out.println("BUSQUE MAS ARRIBA...");
                }else{
                    System.out.println("BUSQUE MAS ABAJO...");
                }
                contador ++;
            }else{
                System.out.println("¡EUREKA!¡ACERTASTE!");
                System.out.println("* INTENTOS TOTALES: " + contador);
                founded = true;
            }
        }
    }
}
