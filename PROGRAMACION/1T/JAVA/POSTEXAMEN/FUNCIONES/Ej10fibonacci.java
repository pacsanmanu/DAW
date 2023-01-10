package POSTEXAMEN.FUNCIONES;
import java.util.Scanner;

public class Ej10fibonacci {
    public static int fibonacci(int numero){
        if(numero > 1){
            return fibonacci(numero - 1) + fibonacci(numero - 2); 
        }else if (numero == 1){
            return 1;
        }else{
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qué número quieres para la secuencia de fibonacci?");
        int n = sc.nextInt();
        int resultadofibonacci;
        resultadofibonacci = fibonacci(n);
        System.out.println(resultadofibonacci);
    }
}