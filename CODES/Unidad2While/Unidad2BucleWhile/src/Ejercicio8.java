// 8. Crea un programa que pida al usuario una contraseña hasta que escriba "java123".

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final String password = "java123";
        String passUser = "";

        while(!password.equals(passUser)){
            System.out.printf("INGRESAR CONTRASEÑA: ");
            passUser = sc.nextLine().toLowerCase();
        }
        System.out.println("¡CONTRASEÑA CORRECTA!");
    sc.close();
    }
}
