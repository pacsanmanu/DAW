package Ej2;

import Ej2.Clases.Zapato;

public class Main {
    public static void main(String[] args) {
        
        Zapato airmax = new Zapato("Air Max 97", 42, "blanco", "plasticosa", true, "alta");
        mostrarZapato(airmax);
    }

    public static void mostrarZapato(Zapato zapato){
        System.out.println(zapato.modelo);    
        System.out.println(zapato.talla);    
        System.out.println(zapato.color);    
        System.out.println(zapato.material);    
        System.out.println(zapato.cordones);    
        System.out.println(zapato.altura);    
    }
}
