package Ej17.Clases;

public abstract class Animal {
    private String nombre;

    public Animal(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    abstract public String saludar();
    @Override
    public String toString(){
        return getClass() + getNombre();
    }
}