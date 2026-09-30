// 8. Determina si un año es bisiesto: divisible por 4, no por 100, salvo que también sea divisible por 400.
// Utiliza if anidados.

public class Ejercicio8 {
    public static void main(String[] args){

        int anio = 2020;
        String mensaje = "No es Biciesto";

        if(anio % 4 == 0)
            if(anio % 100 != 0)
                if(anio % 400 != 0) mensaje = "Biciesto";

        System.out.printf("%s", mensaje);
    }
}

