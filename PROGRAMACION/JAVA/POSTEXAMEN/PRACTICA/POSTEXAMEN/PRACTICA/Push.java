package POSTEXAMEN.PRACTICA;
import java.util.Scanner;
import java.util.Arrays; 

    public class Push {

    public static int[] metodoPush(int[] array, int n){
        int[] aux = new int[array.length + 1];

        for(int i = 0; i < array.length; i++){
            aux[i] = array[i];
        }

        aux[array.length] = n;

        return aux;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] array1 = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("Dime el numero que quieres añadir al array:");
        int numero = sc.nextInt();
        System.out.println(Arrays.toString(metodoPush(array1, numero)));
    }
}
