package POSTEXAMEN.FUNCIONES;
import java.util.Scanner;

public class Ej11dobleN {
    
    public static int dobleN(int numero){
        int doble = 0;
        doble = numero * 2;
        return doble;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qué numero quieres duplicar?");
        int n = sc.nextInt();
        System.out.println(dobleN(n));
    }
}
