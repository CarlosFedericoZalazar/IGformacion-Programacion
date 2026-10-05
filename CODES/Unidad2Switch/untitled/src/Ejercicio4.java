/*
4. Pide dos números y una operación (+, -, *, /).
a) Usa un switch expression para devolver el resultado de la operación.
b) Si se introduce / y el divisor es 0, lanza un mensaje error.
* */
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("INGRESAR NUMERO UNO: ");
        int numeroUno = sc.nextInt();

        System.out.print("INGRESAR OPERACION (+, -, *, /): ");
        String operacion = sc.next();
        boolean error = false;

        System.out.print("INGRESAR NUMERO DOS: ");
        int numeroDos = sc.nextInt();

        float resultado = switch (operacion) {
            case "+" -> numeroUno + numeroDos;
            case "-" -> numeroUno - numeroDos;
            case "*" -> numeroUno * numeroDos;
            case "/" -> {
                if (numeroDos == 0) {
                    System.out.printf("Error, no es posible divididir %d por 0", numeroUno);
                    error = true;
                }
                yield (float) numeroUno / numeroDos;
            }
            default -> {
                System.out.print("Error, operación inexistente");
                error = true;
                yield -1;
            }
        };
        if(!error || resultado != -1) System.out.printf("El resultado es: %.2f%n", resultado);
        sc.close();
    }
}
