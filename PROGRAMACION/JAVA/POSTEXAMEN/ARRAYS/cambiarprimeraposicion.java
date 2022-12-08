package POSTEXAMEN.ARRAYS;
import java.util.Scanner;
import java.util.Arrays;

public class cambiarprimeraposicion {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        int sobrante = 0;

        for(int i = 0; i < array.length; i++){
            System.out.println("Dime un numero:");
            array[i] = sc.nextInt();
        }

        System.out.println("Introduce el numero a sustituir:");
        int n = sc.nextInt();

        for(int j = array.length - 1; j > 0; j--){
                
            if(j == array.length - 1){
                sobrante = array[j];
            }
            array[j] = array[j - 1];
        }

        array[0] = n;

        System.out.println("Se ha perdido el número " + sobrante + ". El array ha quedado así con el nuevo número:");

        System.out.println(Arrays.toString(array));
    }
}