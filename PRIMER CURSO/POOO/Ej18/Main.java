package Ej18;

import java.util.ArrayList;

import Ej18.Clases.*;

public class Main {
    public static void main(String[] args) {
        Persona manu = new Informatico("Manuel", 23);
        Persona messi = new Deportista("Messi", 35);

        Persona[] personas = {
            manu, messi
        };

        for(Persona p : personas){
            if(p instanceof Informatico){
                System.out.println("El dios " + p.getNombre() + " corre " + p.correr());
            }else if(p instanceof Deportista){
                System.out.println("El tito " + p.getNombre() + " corre " + p.correr());
            }
        }
    }
}
