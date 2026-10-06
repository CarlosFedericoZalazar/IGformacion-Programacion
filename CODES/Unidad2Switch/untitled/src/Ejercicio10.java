/*
10. Crea distintos Object para simular un device(dispositivo) e imprimir cada una de las opciones
siguientes.
a) Si es un String, indica el nombre del dispositivo.
b) Si es un Integer, representa el nivel de batería (0–100). Si es menor que 20, mostrar "Batería
baja".
c) Si es null, mostrar "Sin datos".
d) En cualquier otro caso, "Dispositivo desconocido"
* */
public class Ejercicio10 {

    public static void main(String[] args){
    Object device = 15;

        switch (device) {
            case String nombre ->
                    System.out.printf("\nNombre del dispositivo: %s", nombre);
            case Integer bateria when bateria < 20 ->
                    System.out.printf("\nBatería baja %d", bateria);
            case Integer bateria ->
                    System.out.printf("\nNivel de batería: %d", bateria);
            case null ->
                    System.out.println("Sin datos");
            default ->
                    System.out.println("Dispositivo desconocido");
        }
    }
}
