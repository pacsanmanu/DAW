package Ej13;
import Ej13.Clases.*;

public class Main {
    public static void main(String[] args) {
        Baraja mazo = new Baraja();
        mazo.barajar();
        System.out.println(mazo.getCartas());
        mazo.ordenarCartas();
        System.out.println(mazo.getCartas());
    }
}
