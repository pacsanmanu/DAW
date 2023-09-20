package POSTEXAMEN.FUNCIONES;
import java.util.Scanner;

public class Ej12potenciaN {
    
    public static int potenciaN(int numero, int potencia){
        if(potencia > 0){
            return numero * potenciaN(numero, potencia - 1);
        }else{
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("A que numero quieres hacer la potencia?");
        int n = sc.nextInt();
        System.out.println("A cuanto quieres elevarlo?");
        int p = sc.nextInt();
        System.out.println(potenciaN(n, p));
    }
}
