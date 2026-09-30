import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Expresiones {
    public static void main(String[] args) {
        String cp1 = "03001";
        String cp2 = "0300A";

        System.out.println(cp1.matches("\\d{5}")); // true
        System.out.println(cp2.matches("\\d{5}")); // false
    }
}
