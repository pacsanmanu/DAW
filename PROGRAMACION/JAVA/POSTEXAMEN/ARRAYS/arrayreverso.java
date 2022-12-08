package POSTEXAMEN.ARRAYS;
import java.util.Scanner;

public class arrayreverso {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[10];
        
        for(int i = 0; i < arr1.length; i++){
            System.out.println("Dime un numero:");
            arr1[i] = sc.nextInt();
        }

        System.out.print("[");

        for(int i = 0; i < arr1.length / 2; i++){
            System.out.print(arr1[i]);
            System.out.print(", ");
            System.out.print(arr1[(arr1.length - 1) - i]);
            System.out.print(", ");
        }
        System.out.print("]");
    }
}

