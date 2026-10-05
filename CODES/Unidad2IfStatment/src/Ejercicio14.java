import java.util.Scanner;

public class Ejercicio14 {
<<<<<<< HEAD
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
=======
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Lado A: ");
        int a = sc.nextInt();
        System.out.print("\nLado B: ");
        int b = sc.nextInt();
        System.out.print("\nLado C: ");
        int c = sc.nextInt();

        if(a>0 && b>0 && c>0 && a + b > c && a + c > b && b + c > a){
            if(a == b && a == c){
                System.out.println("Es Equilatero");
            } else if ( a==b || b == c || a == c) {
                System.out.println("Es Isósceles");
            }else{
                System.out.println("Es Escaleno");
            }
        } else{
            System.out.println("No es un triangulo");
        }
    }
}
>>>>>>> 85b960edb5acf45ad4d9a0677fcd934e3774e9ed
