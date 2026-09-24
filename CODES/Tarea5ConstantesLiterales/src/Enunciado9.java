/*
8. Imprime estos 4 platos con sus precios. El nombre del plato debe ocupar un ancho de 28:
Croissant con mantequilla 1.80
Tostada integral 2.10
Zumo de naranja 2.50
Café con leche 1.40
* */
public class Enunciado9 {
    public static void main(String[] args){

        System.out.printf("%-28s %.2f\n", "Croissant con mantequilla", 1.80);
        System.out.printf("%-28s %.2f\n", "Tostada integral", 2.10);
        System.out.printf("%-28s %.2f\n", "Zumo de naranja", 2.50);
        System.out.printf("%-28s %.2f", "Café con leche", 1.40);
    }
}
