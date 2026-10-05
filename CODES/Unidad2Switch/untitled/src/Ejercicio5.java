/*
5. Define un enum EstadoPedido { PENDIENTE, PAGADO, ENVIADO, ENTREGADO, CANCELADO }.
Crea un String con un estado de los anteriores.
a) Usa un switch expression sobre EstadoPedido para devolver un mensaje distinto
(ej: “Tu pedido está en camino”).
b) Asegúrate de que sea exhaustivo sin default.
* */
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        enum EstadoPedido {
            PENDIENTE,
            PAGADO,
            ENVIADO,
            ENTREGADO,
            CANCELADO
        }

        String estado = "ENTREGADO";
        EstadoPedido estadoEnum = EstadoPedido.valueOf(estado);

        String mensaje = switch (estadoEnum) {
            case PENDIENTE -> "El pedido está pendiente de pago.";
            case PAGADO    -> "El pago ha sido procesado correctamente.";
            case ENVIADO   -> "Tu pedido está en camino.";
            case ENTREGADO -> "El pedido ya ha sido entregado.";
            case CANCELADO -> "El pedido ha sido cancelado.";
        };
        System.out.println(mensaje);
    }
}
