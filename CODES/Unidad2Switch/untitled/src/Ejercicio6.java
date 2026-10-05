/*
6. Crea un Object del tipo que quieras para obtener algún valor en este switch. Utiliza switch con pattern matching:
a) case String s -> "Texto de longitud " + s.length()
b) case Integer i when i > 100 -> "Número grande"
c) case Integer i -> "Número pequeño"
d) case null -> "Valor nulo"
e) default -> "Otro tipo"
* */

public class Ejercicio6 {
    public static void main(String[] args) {

        Object objeto = "Carlos";

        String resultado = switch (objeto) {
            case String s                -> "Texto de longitud " + s.length();
            case Integer i when i > 100  -> "Número grande";
            case Integer i               -> "Número pequeño";
            case null                    -> "Valor nulo";
            default                      -> "Otro tipo";
        };
        System.out.println(resultado);
    }
}