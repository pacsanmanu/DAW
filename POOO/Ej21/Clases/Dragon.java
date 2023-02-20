package Ej21.Clases;

public class Dragon extends Animal implements Volador{
    public Dragon(String nombre){
        super(nombre);
    }
    public String saludar(){
        return "Hola soy tu animalaco " + getNombre() + " GRRRRRRRAAAAAAAAAAAAAAAUUUUUUUUUUU";
    }
    public void Volar(){
        System.out.println("El bichardo voladoooooooor");
    }
}
