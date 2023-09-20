package POSTEXAMEN.PRACTICA;
import java.util.Scanner;
import java.util.Arrays; 

    public class Unshift {

    public static int[] metodoUnshift(int[] array, int n){
        int[] aux = new int[array.length + 1];

        for(int i = array.length; i > 0; i--){
            aux[i] = array[i - 1];
        }

        aux[0] = n;

        return aux;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] array1 = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Introduce el numero a añadir:");
        int numero = sc.nextInt();
        System.out.println((Arrays.toString(metodoUnshift(array1, numero))));
    }
}
