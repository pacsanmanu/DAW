package POSTEXAMEN.ARRAYS;
import java.util.Scanner;

public class unirarrays1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] array1 = new int[4];
        int cont1 = 0;
        int[] array2 = new int[4];
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

        for(int i = 0; i < arrayjunto.length; i++){
            if(i % 2 == 0){
                arrayjunto[i] = array1[cont1];
                cont1++;
            }else{
                arrayjunto[i] = array2[cont2];
                cont2++;
            }
        }

        System.out.print("[");
        for(int i = 0; i < arrayjunto.length; i++){
            System.out.print(arrayjunto[i] + ", ");
        }
        System.out.println("]");

    }
}