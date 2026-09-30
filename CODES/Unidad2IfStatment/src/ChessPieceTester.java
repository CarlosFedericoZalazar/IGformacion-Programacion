// CORREGIR EL CODIGO

import java.util.Scanner;

public class ChessPieceTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String piece;

        System.out.println("Introduce la inicial del nombre de la pieza de ajedrez: ");
        piece = sc.nextLine();

        if (piece.equals("R")) { // Rey
            System.out.println("Puede moverse en todas direcciones pero solo avanza una posición.");
        } else if (piece.equals("D")) { // Dama o reina
            System.out.println("Puede moverse en todas direcciones todas las casillas que desee.");
        } else if (piece.equals("T")) { // Torre
            System.out.println("Puede moverse en filas o columnas todas las casillas que desee.");
        } else { // Caso por defecto / Pieza desconocida
            System.out.println("Pieza no contemplada.");
        }
    }
}