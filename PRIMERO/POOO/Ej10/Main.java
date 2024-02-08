package Ej10;
import Ej10.Clases.*;

public class Main {
    public static void main(String[] args) {
        Cafetera cafetera1 = new Cafetera();
        Cafetera cafetera2 = new Cafetera(500);

        cafetera2.servirTaza(400);
        System.out.println(cafetera2.getCapacidadActual());
    }
    
}