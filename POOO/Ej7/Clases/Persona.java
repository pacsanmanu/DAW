package Ej7.Clases;
import Ej7.Clases.*;

public class Persona {
    private String Nombre;
    private int Edad;
    private char Talla;
    private Camiseta Camiseta;

    public Persona(String Nombre, int Edad, char Talla, Camiseta Camiseta){
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Talla = Talla;
        this.Camiseta = Camiseta;
    }

    public void probarCamiseta(Camiseta camiseta){
        this.Camiseta = camiseta;
    }

    public boolean ponerCamiseta(Persona persona){
        boolean quedaBien = true;
        
        if(this.Talla == this.Camiseta.Talla){
            quedaBien = true;
        }else{
            quedaBien = false;
        }

        return quedaBien;
    }
}
