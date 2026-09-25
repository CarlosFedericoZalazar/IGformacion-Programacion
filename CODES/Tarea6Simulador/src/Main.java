import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Constantes de límites de velocidad
        final int VEL_MAX_URBANA = 50;
        final int VEL_MAX_CARRETERA = 90;
        final int VEL_MAX_AUTOVIA = 120;

        int velocidadLimite = 0;
        int velocidad = 0;

        Scanner sc = new Scanner(System.in);

        // Selección del tipo de vía
        System.out.print("INGRESE VIA: \n1 - URBANA\n2 - CARRETERA\n3 - AUTOVIA\n");
        int opc;
        do {
            System.out.print("SELECCIONE OPCION (1-3): ");
            opc = sc.nextInt();
        } while (opc < 1 || opc > 3);


        switch (opc) {
            case 1 -> velocidadLimite = VEL_MAX_URBANA;
            case 2 -> velocidadLimite = VEL_MAX_CARRETERA;
            case 3 -> velocidadLimite = VEL_MAX_AUTOVIA;
        }

        final int CANTIDAD_CAMBIOS_VELOCIDAD = 3;

        for (int i = 0; i < CANTIDAD_CAMBIOS_VELOCIDAD; i++) {
            int aux;
            boolean velocidadValida;

            do {
                System.out.printf("\nCAMBIO DE VELOCIDAD %d (Actual: %d km/h): ", i + 1, velocidad);
                aux = sc.nextInt();

                  if (velocidad + aux < 0) {
                    System.out.println("ERROR: VELOCIDAD NO PUEDE SER MENOR A 0");
                    velocidadValida = false;
                } else {
                    velocidad += aux;
                    velocidadValida = true;
                }
            } while (!velocidadValida);

            // Evaluación y salida del estado del límite (se ejecuta una sola vez por iteración)
            String mensaje = (velocidad > velocidadLimite) ? "LIMITE SUPERADO" : "LIMITE JOYA";
            System.out.printf("%s (Velocidad total: %d km/h)\n", mensaje, velocidad);
        }

        sc.close(); // Buena práctica: cerrar el Scanner al finalizar
    }
}
