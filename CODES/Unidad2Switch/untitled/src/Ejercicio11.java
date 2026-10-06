import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Elige una opción del 1 al 5 para comenzar la aventura:");
        System.out.println("1 - La moto");
        System.out.println("2 - El misterio");
        System.out.println("3 - La cueva");
        System.out.println("4 - A la deriva");
        System.out.println("5 - Tristeza");

        System.out.print("Introduce tu opción: ");
        int opcion = sc.nextInt();

        String fragmento = switch (opcion) {
            case 1 -> "Emprendes un viaje adentrandote en las curvas de los Pirineos";
            case 2 -> "De repente te ves metido en el misterioro suicidio de tu vecino";
            case 3 -> "Encuentras una cueva secreta detrás de una cascada.";
            case 4 -> "Lo que era una navegación de pesca se convierte en tu pesadilla";
            case 5 -> "Despiertas sabiendo que Messi se retira del seleccionado argentino de futbol";
            default -> "Esa opción no existe, la aventura termina antes de empezar.";
        };
        System.out.println("\n--- TU HISTORIA ---");
        System.out.println(fragmento);

        sc.close();
    }
}