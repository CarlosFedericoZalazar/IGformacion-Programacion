import javax.print.DocFlavor;

public class Ejercicio1 {
    public static void main(String[] args){
        int a = 5;
        int b = 3;
        int c = 2;

        a += b++;
        c *= --a;
        b = a % c;

        System.out.printf("a=%d b=%d c=%d", a,b,c);
        //a=7 b=7 c=14
    }
}
