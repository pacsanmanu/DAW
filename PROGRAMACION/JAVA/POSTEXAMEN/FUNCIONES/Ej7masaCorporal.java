package POSTEXAMEN.FUNCIONES;
import java.util.Scanner;

public class Ej7masaCorporal {

    public static double masaCorporal(double a, double b){
        double masa = a / (b * b);
        return masa;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca su peso en kilogramos:");
        double peso = sc.nextDouble();
        System.out.println("Introduzca su estatura en metros:");
        double estatura = sc.nextDouble();
        double masa = masaCorporal(peso, estatura);

        if(masa <= 18.50){
            System.out.println("Su masa corporal es de " + (double)Math.round(masa * 100) / 100 + ".");
            System.out.println("Su peso es inferior a lo normal.");
        }else if(masa > 18.50 && masa < 24.99){
            System.out.println("Su masa corporal es de " + (double)Math.round(masa * 100) / 100 + ".");
            System.out.println("Su peso es normal.");
        }else if(masa > 25 && masa <= 30){
            System.out.println("Su masa corporal es de " + (double)Math.round(masa * 100) / 100 + ".");
            System.out.println("Usted tiene sobrepeso.");
        }else if(masa > 30){
            System.out.println("Su masa corporal es de " + (double)Math.round(masa * 100) / 100 + ".");
            System.out.println("Usted tiene obesidad.");
        }
        
    }
}
