import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el lado a: ");
        double a = scanner.nextDouble();

        System.out.print("Ingrese el lado b: ");
        double b = scanner.nextDouble();

        System.out.print("Ingrese el lado c: ");
        double c = scanner.nextDouble();

        if (a > 0 && b > 0 && c > 0) {
            if (a == b && b == c) {
                System.out.println("Equilátero");
            } else if (a == b || b == c || a == c) {
                System.out.println("Isósceles");
            } else {
                System.out.println("Escaleno");
            }
        } else {
            System.out.println("No es un triángulo");
        }
        scanner.close();
    }
}