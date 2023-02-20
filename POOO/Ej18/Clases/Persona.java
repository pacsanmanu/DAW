package Ej18.Clases;

public abstract class Persona {
    private String nombre;
    private int edad;
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    public String getNombre(){
        return this.nombre;
    }
    abstract public int correr();
}
