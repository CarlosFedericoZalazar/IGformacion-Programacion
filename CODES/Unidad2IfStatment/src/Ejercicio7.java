//7. Programa que pida tres números y muestre cuál es el mayor. Utiliza if anidados.
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int maximo;

        System.out.print("1). Ingresar NUMERO: ");
        int numero1 = sc.nextInt();

        System.out.print("2). Ingresar NUMERO: ");
        int numero2 = sc.nextInt();

        System.out.print("3). Ingresar NUMERO: ");
        int numero3 = sc.nextInt();

        if(numero1>numero2){
            if(numero1>numero3){
                maximo = numero1;
            }else{
                maximo = numero3;
            }
        } else{
            if(numero2>numero3){
                maximo = numero2;
            } else{
                maximo = numero3;
            }
        }
        System.out.printf("NUMERO MAXIMO ES %d", maximo);
    }
}
