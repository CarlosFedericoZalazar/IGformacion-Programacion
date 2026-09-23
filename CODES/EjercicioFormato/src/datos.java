import java.util.Scanner;

public class datos {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.printf("NOMBRE: ");
        String nombre = sc.nextLine();

        System.out.printf("EDAD: ");
        int edad = sc.nextInt();

        System.out.printf("NOTA MEDIA: ");
        double notaMedia = sc.nextDouble();

        System.out.printf("ALUMNO: %s\nEDAD: %d\nNOTA MEDIA: %07.2f", nombre, edad, notaMedia);

        sc.close();

    }
}
