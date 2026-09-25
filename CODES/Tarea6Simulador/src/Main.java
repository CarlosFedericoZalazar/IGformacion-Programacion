import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        final int VEL_MAX_URBANA = 50;
        final int VEL_MAX_CARRETERA = 90;
        final int VEL_MAX_AUTOVIA = 120;

        int velocidadLimite = 0;
        int velocidad = 0;

        int opc;
        int cantidadCambiosVelocidad = 3;

        Scanner sc = new Scanner(System.in);

        System.out.printf("INGRESE VIA: \n" +
                        "1 - URBANA\n" +
                        "2 - CARRETERA\n" +
                        "3 - AUTOVIA\n");

        do{
            System.out.printf("SELECCIONE OPCION (1/3): ");
            opc = sc.nextInt();
        }while(opc<1 || opc>3);

        switch (opc){
            case 1 -> velocidadLimite = VEL_MAX_URBANA;
            case 2 -> velocidadLimite = VEL_MAX_CARRETERA;
            case 3 -> velocidadLimite = VEL_MAX_AUTOVIA;
        }

        for(int i = 0; i<cantidadCambiosVelocidad; i++){
            do{
                if(velocidad < 0) System.out.printf("ERROR: VELOCIDAD NO PUEDE SER MENOR A 0\n");
                System.out.printf("\nCAMBIO DE VELOCIDAD:  %d\n", i+1);
                velocidad += sc.nextInt();

            }while (velocidad < 0);
        }


    }
}
