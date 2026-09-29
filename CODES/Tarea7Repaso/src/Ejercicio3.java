/*
3. Ficha personal interactiva. Crea un programa que:
• Pida al usuario su nombre, edad, altura en metros y peso en kg.
• Calcule el IMC (Índice de Masa Corporal) usando la fórmula: IMC = peso / (altura * altura)
• Muestre por pantalla con printf algo como (el IMC con dos decimales):
* */
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("NOMBRE: ");
        String nombre = sc.nextLine();

        System.out.print("EDAD: ");
        int edad = sc.nextInt();

        System.out.print("ALTURA (m): ");
        float altura = sc.nextFloat();

        System.out.print("PESO (kg): ");
        float peso = sc.nextFloat();

        float calculoIMC = peso / (float)Math.pow(altura,2);

        System.out.printf("\nNOMBRE: %s\nEdad: %d\nAltura: %.2f m\nPeso: %.1f kg\nIMC Calculado: %.2f", nombre, edad, altura, peso, calculoIMC);

    }
}

