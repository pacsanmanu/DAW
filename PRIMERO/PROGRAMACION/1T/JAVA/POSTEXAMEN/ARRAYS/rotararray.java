package POSTEXAMEN.ARRAYS;
import java.util.Scanner;

public class rotararray {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        int sobrante = 0;

        for(int i = 0; i < array.length; i++){
            System.out.println("Dime un numero:");
            array[i] = sc.nextInt();
        }

        System.out.println("Cuantas veces quieres rotar el array?");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){

            for(int j = array.length - 1; j > 0; j--){
                
                if(j == array.length - 1){
                    sobrante = array[j];
                }
                array[j] = array[j - 1];
            }
            
            array[0] = sobrante;
        }

        System.out.print("[");
        for(int i= 0; i < array.length; i++){
            System.out.print(array[i] + ", ");
        }
        System.out.print("]");



    }
}
