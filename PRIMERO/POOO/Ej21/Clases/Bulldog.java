package Ej21.Clases;

public class Bulldog extends Perro{
    public Bulldog(String nombre){
        super(nombre);
    }
    public String saludar(){
        return "Hola soy tu animalaco " + getNombre() + " GUAU GUAU";
    }
}
