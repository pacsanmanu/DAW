package Ej17;

import Ej17.Clases.Animal;
import Ej17.Clases.Bulldog;
import Ej17.Clases.Dragon;
import Ej17.Clases.Gato;
import Ej17.Clases.Pajaro;
import Ej17.Clases.Perro;

public class Main {
    public static void main(String[] args) {
        Perro yeli = new Perro("Yeli");
        Gato garfield = new Gato("Garfield");
        Pajaro pepito = new Pajaro("Pepito");
        Bulldog jorge = new Bulldog("Jorge");
        Dragon rayquaza = new Dragon("Rayquaza");

        Animal[] animales = {
            yeli, garfield, pepito, jorge, rayquaza
        };
 
        for(Animal a : animales){
            System.out.println(a.saludar());
        }
    }
}