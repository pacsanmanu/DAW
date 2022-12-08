package POSTEXAMEN.ARRAYS;
import java.util.Scanner;

public class arrayconnuevaentradaenN {
    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);

        int[] array = new int[10];

        for(int i = 0; i < array.length - 2; i++){
            System.out.println("Introduce un número:");
            array[i] = sc.nextInt();
        }

        System.out.println("En que posicion quieres introducir un nuevo valor?");
        int posicion = sc.nextInt() - 1;

        while(posicion < 0 || posicion > 10){
            System.out.println("Introduzca una posición válida:");
            posicion = sc.nextInt() - 1;
        }

        for(int i = array.length - 1; i > posicion; i--){
            array [i] = array[i - 1];
        }

        System.out.println("Dime un nuevo número:");
        array[posicion] = sc.nextInt();

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
