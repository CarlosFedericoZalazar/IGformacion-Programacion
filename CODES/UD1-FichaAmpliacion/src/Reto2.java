public class Reto2 {
    public static void main (String[] args){
        int nota1 = 7;
        int nota2 = 8;
        int nota3 = 10;
        double media = (double)(nota1 + nota2 + nota3) / 3;
        System.out.println("Media = " + media);

        System.out.printf("Respuesta: hay perdida de informacion debido a que Java toma el resultado de la operacion como un " +
                "numero entero. Solucion, castear al menos una de las variables");
    }
}
