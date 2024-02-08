package Ej19.Clases;

public class Persona {
    private String nombre;
    private String apellido;
    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    @Override
    public String toString(){
        return "[" + getNombre() + ", " + getApellido() + "]";
    }
}
