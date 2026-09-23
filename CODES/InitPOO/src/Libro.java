public class Libro {
    String titulo;
    String autor;
    int paginas;
    String edicion;
    boolean disponible = true;


    //metodos
    void prestado(){
        disponible=false;
    }

    void devolver(){
        disponible=true;
    }
}
