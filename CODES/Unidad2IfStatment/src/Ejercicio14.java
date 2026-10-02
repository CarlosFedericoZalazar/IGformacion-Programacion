import java.util.Scanner;

public class Ejercicio14 {
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
