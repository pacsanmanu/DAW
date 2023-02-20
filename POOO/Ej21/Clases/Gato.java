package Ej21.Clases;

public class Gato extends Animal{
    public Gato(String nombre){
        super(nombre);
    }
    public String saludar(){
        return "Hola soy tu animalito " + getNombre() + " miau miau UWU";
    }
}
