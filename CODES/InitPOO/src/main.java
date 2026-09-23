public class Main {
    public static void main(String[] args){
        Libro a = new Libro();
        a.titulo = "Hombre en llamas";
        a.paginas = 387;

        System.out.println(a.disponible);
        a.prestado();

        System.out.println(a.disponible);

    }
}
