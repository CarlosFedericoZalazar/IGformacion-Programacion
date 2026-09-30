//9. Programa que lea la edad y compruebe si está en el rango [18, 65] inclusive.
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] argsg){
        Scanner sc = new Scanner(System.in);

        System.out.printf("Ingresar Edad: ");
        int edad = sc.nextInt();
        String mensaje = (edad > 17 && edad < 66) ? "EN RANGO" : "FUERA DE RANGO";

        System.out.printf("%s", mensaje);
    }

}
