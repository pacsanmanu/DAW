package POSTEXAMEN.FUNCIONES;
import java.util.Scanner;

public class Ej8sumaN {
    
    public static int sumaN(int numero){
        int sumatorio = 0;
        for(int i = 0; i <= numero; i++){
            sumatorio += i;
        }
        return sumatorio;
    }

    public static int sumaN2(int numero){
            if(numero == 1){
                return 1;
            }else{
                return numero - sumaN2(numero - 1);
            }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qué número quieres para el sumatorio?");
        int n = sc.nextInt();
        int sumatorio;
        int sumatorio2;
        sumatorio = sumaN(n);
        sumatorio2 = sumaN2(n);
        System.out.println(sumatorio);
        System.out.println(sumatorio2);
    }
}