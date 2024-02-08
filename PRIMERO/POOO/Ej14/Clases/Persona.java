package Ej14.Clases;

public class Persona {
    protected String nombre;
    protected int edad;

    protected Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public void Saludar(){
        System.out.println("Hola, soy " + this.nombre);
    }

    @Override
    public String toString(){
        return "[" + this.nombre + ", " + this.edad + "]";
    }
}