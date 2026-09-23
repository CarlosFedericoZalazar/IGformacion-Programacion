/*
Tienes una duración expresada únicamente en segundos. Programa la conversión a horas, minutos y
segundos usando división entera y el operador módulo (%).
int segundosTotales = 9876;

La salida para ese valor debe ser:
2 horas, 44 minutos y 36 segundos
• No puedes escribir los resultados a mano: deben salir de operaciones.
• Prueba después con 3600, 65, 59 y 7325 segundos.
• Añade una variable nueva con 100000 segundos y comprueba si tu solución sigue funcionando.
* */

public class Reto5Cronometro {
    public static void main(String[] args){

        int segundosTotales = 65;

        int hora = (segundosTotales / 60) / 60;

        int minutos = (segundosTotales / 60) % 60;

        int segundos = segundosTotales % 60;

        System.out.printf("%d:%d:%d", hora, minutos, segundos);

    }
}
