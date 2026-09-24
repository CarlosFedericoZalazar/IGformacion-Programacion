/*
10. Haz un programa que haga 3 preguntas al usuario usando nextLine(), nextInt() y nextBoolean().
• Después muestra un resumen de sus respuestas formateadas.
 */

import java.util.Scanner;

public class Enunciado10 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("¿Banda de música favorita?");
        String musica = sc.nextLine();

        System.out.println("¿Edad?");
        int edad= sc.nextInt();

        System.out.println("¿Le gusta programar?");
        boolean programarOk = sc.nextBoolean();

        System.out.print("RESPUESTAS\n");
        System.out.printf("Consultado al usuario sobre su banda de música favorita refiere" +
                " que es %s, el mismo tiene %d de edad\ny consultrado si le gusta la programación" +
                " refiere que %s", musica, edad, (programarOk)?"SI":"NO");

    }
}
