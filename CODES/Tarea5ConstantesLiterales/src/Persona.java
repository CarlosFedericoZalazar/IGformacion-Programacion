/*
11. Introducción a la Programación Orientada a Objetos.
• Lee detenidamente el apartado de POO de la teoría.
• Crea una clase con al menos 3 atributos y 3 acciones.
• Después crea un objeto de esa clase y asigna valores a los atributos creados.
*/

public class Persona {

    public static void main(){
        Persona persona = new Persona("Carlos", 42, 1.70);
        persona.camninar();
        persona.estudiar();
        persona.dormir();
    }

    String nombre;
    int edad;
    double altura;

    public Persona(String nombre, int edad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    public void camninar(){
        System.out.printf("\n%s esta caminando...", this.nombre);
    }

    public void estudiar(){
        System.out.print("\nLa persona esta estudiando...");
    }

    public void dormir(){
        System.out.print("\nLa persona esta durmiendo...");
    }
}
