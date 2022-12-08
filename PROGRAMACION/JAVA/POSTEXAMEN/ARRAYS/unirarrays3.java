package POSTEXAMEN.ARRAYS;
import java.util.Scanner;

public class unirarrays3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] array1 = new int[6];
        int cont1 = 0;
        int[] array2 = new int[6];
        int cont2 = 0;
        int[] arrayjunto = new int[array1.length + array2.length];

        for(int i = 0; i < array1.length ; i++){
            System.out.println("Dime un número:");
            array1[i] = sc.nextInt();
        }

        for(int i = 0; i < array2.length ; i++){
            System.out.println("Dime un número:");
            array2[i] = sc.nextInt();
        }

        for(int i = 0; i < 3; i++){
            arrayjunto[i] = array1[i];    
        }

        for(int i = 3; i < 6; i++){
            arrayjunto[i] = array2[i - 3];    
        }

        for(int i = 6; i < 9; i++){
            arrayjunto[i] = array1[i - 3];    
        }

        for(int i = 9; i < 12; i++){
            arrayjunto[i] = array2[i - 6];    
        }

        System.out.print("[");
        for(int i = 0; i < arrayjunto.length; i++){
            System.out.print(arrayjunto[i] + ", ");
        }
        System.out.println("]");

    }
}
