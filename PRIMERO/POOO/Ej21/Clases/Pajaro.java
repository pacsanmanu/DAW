package Ej21.Clases;

public class Pajaro extends Animal implements Volador{
    public Pajaro(String nombre){
        super(nombre);
    }
    public String saludar(){
        return "Hola soy tu animalito " + getNombre() + " pio pio"; 
    }
    public void Volar(){
        System.out.println("El bixo voladoooooooooor");
    }
}
