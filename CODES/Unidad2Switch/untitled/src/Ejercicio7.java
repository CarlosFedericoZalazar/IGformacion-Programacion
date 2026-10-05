/*
Switch con String
7. Supón que tienes un sistema de entradas con estos tipos:
a) "VIP" → acceso completo
b) "NORMAL" → acceso estándar
c) "REDUCIDO" → acceso con descuento
d) Cualquier otro valor → acceso denegado
Implementa un programa que lea un tipo de acceso con String y con switch expression que
devuelva un mensaje con el nivel de acceso. Después, mejora el programa para que acepte
null y devuelva "Entrada no válida".
* */
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("INGRESE TIPO DE ACCESO (VIP, NORMAL, REDUCIDO)");
        String acceso = sc.nextLine().toUpperCase();

        String mensaje = switch (acceso) {
            case "VIP"      -> "Acceso completo";
            case "NORMAL"   -> "Acceso estándar";
            case "REDUCIDO" -> "Acceso con descuento";
            case null       -> "Entrada no válida";
            default         -> "Acceso denegado";
        };
        System.out.println(mensaje);
    }
}
