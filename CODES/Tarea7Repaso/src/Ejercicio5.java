public class Ejercicio5 {
    public static void main(String[] args){
        int x = 3, y = 5, z = 7;
        int m = ++x + y++ - (z -= x) + (x += y)
                - (--y * z) + (x++ % 3) - (z++ / 2);
        System.out.println("x=" + x);
        System.out.println("y=" + y);
        System.out.println("z=" + z);
        System.out.println("m=" + m);
    }
}
