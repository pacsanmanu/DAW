package POSTEXAMEN.FUNCIONES;
import java.util.Scanner;

public class Ej6cambioMoneda {
    
    public static double cambioMoneda(double a){
        double cambio = 0;
        cambio = a * 0.97;
        return cambio;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime cuantos dólares quieres cambiar a euro:");
        double dolares = sc.nextDouble();
        System.out.println("Sus dólares equivalen a " + (double)Math.round(cambioMoneda(dolares) * 100) / 100 + " euros.");
    }
}