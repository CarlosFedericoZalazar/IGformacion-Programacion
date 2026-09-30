/*
6. Programa que lea la nota (0–10) de un alumno y muestre la calificación:
a) 0–4 → “Insuficiente”
b) 5 → “Suficiente”
c) 6 → “Bien”
d) 7–8 → “Notable”
e) 9–10 → “Sobresaliente”
* */
import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean notaoK;
        int nota;
        do{
            notaoK=true;
            System.out.print("INGRESAR NOTA: ");
            nota = sc.nextInt();

            if(nota<0 || nota>10 ){
                System.out.print("ERROR: Ingresar nota entre 0 y 10.\n");
                notaoK = false;
            }
        }while(!notaoK);
        String mensaje;
        if(nota >= 0 && nota <= 4 ){
            mensaje = "Insuficiente";
        } else if (nota==5) {
            mensaje = "Insuficiente";
        } else if (nota==6) {
            mensaje = "bien";
        } else if (nota==5) {
            mensaje = "Insuficiente";
        } else if (nota==7 || nota==8 ) {
            mensaje = "Notable";
        } else{
            mensaje = "Sobresaliente";
        }
        System.out.println(mensaje);
    }
}
