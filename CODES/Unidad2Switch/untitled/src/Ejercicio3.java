/*
3. Crea un programa que reciba un número del 1 al 12 (mes del año) y diga a qué estación pertenece.
a) Usa multi-etiqueta en el switch (ej: case 12, 1, 2 -> "Invierno";).
* */
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("INGRESAR MES DEL AÑO: ");
        int mes = sc.nextInt();

        String estacionAnio = switch (mes){
            case 3,4,5 -> "Primavera";
            case 6,7,8 -> "Verano";
            case 9,10,11 -> "Otoño";
            case 12,1,2 -> "Invierno";
            default -> "Mes inválido";
        };
        System.out.printf("ESTACION DEL AÑO: %s", estacionAnio);
    }
}
