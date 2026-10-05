/**
 1. Crea un programa que, dado un número del 1 al 7, imprima el día correspondiente (1 → Lunes, 2 → Martes, etc.).
 a) Usa switch clásico con break.
 b) Añade default para valores inválidos.
 */
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("NUMERO CORRESPONDINETE AL DIA: ");
        int numberOfDay = sc.nextInt();

        switch (numberOfDay){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Inválido");
        }
    }
}
