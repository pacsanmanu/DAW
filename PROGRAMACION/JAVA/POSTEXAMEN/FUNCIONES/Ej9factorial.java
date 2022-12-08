package POSTEXAMEN.FUNCIONES;
import java.util.Scanner;

public class Ej9factorial {
    
    public static int factorial(int numero){
        if(numero == 1){
            return 1;
        }else{
            return numero * factorial(numero - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qué número quieres para el factorial?");
        int n = sc.nextInt();
        int resultadofactorial;
        resultadofactorial = factorial(n);
        System.out.println(resultadofactorial);
    }
}