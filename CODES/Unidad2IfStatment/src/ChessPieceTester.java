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
            System.out.println(/* rellena */);
        } else if (piece.equals("")) {
// completar
        } else {
// completar
        }
    }
}