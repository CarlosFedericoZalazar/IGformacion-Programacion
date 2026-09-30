/*
12. Crea un programa que pida usuario y contraseña. Si usuario es "admin" y
contraseña "1234", muestra "Acceso concedido". Si el usuario existe, pero la contraseña
es incorrecta, muestra "Contraseña incorrecta". Si el usuario no es "admin",
muestra "Usuario no válido". */

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        final String USER = "admin";
        final String PASS = "1234";
        String mensaje;

        System.out.print("USUARIO: ");
        String inputUser = sc.nextLine();

        System.out.print("CONTRASEÑA: ");
        String inputPass = sc.nextLine();

        if(inputUser.equals(USER) && inputPass.equals(PASS)){
            mensaje = "Acceso concedido";
        } else if (inputUser.equals(USER)) {
            mensaje = "Contraseña incorrecta";
        } else {
            mensaje = "Usuario no válido";
        }
        System.out.printf("\n%s", mensaje);
    }
}
