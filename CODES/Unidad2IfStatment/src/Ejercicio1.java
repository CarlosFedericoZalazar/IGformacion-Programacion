/*
If solo
1. Declara una variable entera edad con un valor y muestra "Mayor de edad" si es ≥ 18.
*/

public class Ejercicio1 {
    public static void main(String[] args){
        int edad = 17;

        String mensaje = edad >=18 ? "Mayor de edad" : "Menor de edad";
        System.out.printf("%s", mensaje);
    }
}
