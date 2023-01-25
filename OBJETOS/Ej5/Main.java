package Ej5;

import java.util.Arrays;
import Ej5.Clases.*;
import Ej5.Clases.Enumerados.Colores;

public class Main {
public static void main(String[] args) {
    
    Pixel p = new Pixel(2.8453, 1.9982, Colores.Rojo);
    Pixel p2 = new Pixel(1.5555, 2.5555, Colores.Azul);
    p.setColor(Enumerados.Colores.Verde);
    p2 = p;

    System.out.println(p.toString());
    
    if(p != p2){
        p2.setColor(Enumerados.Colores.Amarillo);
    }else{
        p2.setX(p.x * 2);
        p2.setY(p.y * 2);
        p2.setColor(Enumerados.Colores.Rojo);
    }
    System.out.println(p2.toString());
    
    }
    
}