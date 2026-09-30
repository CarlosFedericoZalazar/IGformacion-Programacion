/*
4. Declara una variable nota y muestra "Aprobado" si es mayor o igual a 5, y "Suspenso" en caso contrario.*/

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean notaoK;
        int nota;

        do{
            notaoK=true;
            System.out.print("INGRESAR NOTA: ");
            nota = sc.nextInt();

            if(nota<=0 || nota>10 ){
                System.out.print("ERROR: Ingresar nota entre 1 y 10.\n");
                notaoK = false;
            }
        }while(!notaoK);
        String mensaje = nota >= 5 ? "Aprobado" : "Suspenso";

        System.out.printf("CALIFICACION DE LA NOTA %d: %s",nota, mensaje);
    }
}
