package Ej8;
import Ej8.Clases.*;

public class Main {
    public static void main(String[] args) {
        Monitor elbicho = new Monitor("BenQ Zowie", 1920, 1080);
        System.out.println(elbicho);
        elbicho.encender();
        System.out.println(elbicho);

    }
}