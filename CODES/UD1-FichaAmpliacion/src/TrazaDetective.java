//
public class TrazaDetective {
    public static void main(String[] arg){
        int a = 4;
        int b = 2;
        int c = 20;
        a += b++;
        c -= ++a;
        b *= 2;
        int d = c % b;
        a = a + d;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);

    }
}
