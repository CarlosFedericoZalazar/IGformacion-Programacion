
/*
4. Crea un programa de un boletín de notas que haga lo siguiente:
• Pida al usuario: nombre y tres notas de 0 a 10 (con 1 decimal), además del porcentaje de asistencia de 0 a 100.
• Calcule la media de las tres notas.
• Determine usando operador ternario los siguientes parámetros:
• Estado: “Aprobado” si la media es mayor o igual a 5 y la asistencia es mayor o igual al 80%; en caso contrario,
“Suspenso”.
• Mención (usando ternarios anidados):
• Si la media es mayor o igual a 9 → “Matrícula de honor”.
• Si la media es mayor o igual a 7 → “Notable”.
• Si la media es mayor o igual a 5 → “Aprobado”.
• En otro caso → “Insuficiente”.
• Media redondeada.
• Muestre un resumen formateado con printf así:
* */
import java.util.Scanner;

public class Ejercicio4 {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("NOMBRE:");
        String nombre = sc.nextLine();

        System.out.print("NOTA 1: ");
        float nota1 = sc.nextFloat();

        System.out.print("NOTA 2: ");
        float nota2 = sc.nextFloat();

        System.out.print("NOTA 3: ");
        float nota3 = sc.nextFloat();

        System.out.print("PORCENTAJE DE ASISTENCIA: ");
        int porcentajeAsistencia = sc.nextInt();

        float mediaNotas  = (nota1 + nota2 + nota3) / 3;

        String estadoMateria = (mediaNotas >= 5 && porcentajeAsistencia>80) ? "Aprobado" : "Suspenso";

        String mencionMateria = (mediaNotas>=9) ? "Matricula de Honor" :
                                (mediaNotas>=7) ? "Notable":
                                (mediaNotas>=5) ? "Aprobado" : "Insuficiente";

        int mediaredondeada = Math.round(mediaNotas);

        System.out.print("\nRESULTADO:\n");
        System.out.printf("Nombre: %s\n", nombre);
        System.out.printf("Notas: %.1f, %.1f, %.1f\n", nota1, nota2, nota3);
        System.out.printf("Asistencia: %d\n", porcentajeAsistencia);
        System.out.printf("Media: %.2f\n", mediaNotas);
        System.out.printf("Estado: %s\n", estadoMateria);
        System.out.printf("Mención: %s\n", mencionMateria);
        System.out.printf("Media redondeada: %d\n", mediaredondeada);

        sc.close();
    }
}
