package Ej17.Clases;

public class Dragon extends Animal{
    public Dragon(String nombre){
        super(nombre);
    }
    public String saludar(){
        return "Hola soy tu animalaco " + getNombre() + " GRRRRRRRAAAAAAAAAAAAAAAUUUUUUUUUUU";
    }
}
