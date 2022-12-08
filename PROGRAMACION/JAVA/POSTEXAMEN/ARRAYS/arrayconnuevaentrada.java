package POSTEXAMEN.ARRAYS;
import java.util.Scanner;

public class arrayconnuevaentrada {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[] array = new int[10];

        for(int i = 0; i < array.length - 2; i++){
            System.out.println("Introduce un número:");
            array[i] = sc.nextInt();
        }

        for(int i = array.length - 1; i > 0; i--){
            array [i] = array[i - 1];
        }

        System.out.println("Dime un nuevo número:");
        array[0] = sc.nextInt();

        System.out.print("[");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]);
            if(i != array.length - 1){
                System.out.print(", ");
            }
        }
        System.out.print("]");

    }
}