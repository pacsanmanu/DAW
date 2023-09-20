package Ej21.Clases;

public class Perro extends Animal {
    public Perro(String nombre){
        super(nombre);
    }
    public String saludar(){
        return "Hola soy tu animalito " + getNombre() + " guau guau";
    }
}
