package Ej17.Clases;

public class Pajaro extends Animal{
    public Pajaro(String nombre){
        super(nombre);
    }
    public String saludar(){
        return "Hola soy tu animalito " + getNombre() + " pio pio"; 
    }
}
