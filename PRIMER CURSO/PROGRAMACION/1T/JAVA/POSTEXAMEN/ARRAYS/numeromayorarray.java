package POSTEXAMEN.ARRAYS;
import java.util.Scanner;

public class numeromayorarray {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[10];
        int maximo = 0;
        int minimo = Integer.MAX_VALUE;
        int posicionpositivo = 1;
        int posicionnegativo = 1;

        for(int i = 0; i < arr1.length; i++){
            System.out.println("Escribe un numero:");
            arr1[i] = sc.nextInt();
        }

        for(int i = 0; i < arr1.length; i++){
            if(arr1[i] > maximo){
                maximo = arr1[i];
                posicionpositivo = i;
            }

            if(arr1[i] < minimo){
                minimo = arr1[i];
                posicionnegativo = i;
            }
        }   

        System.out.println("El número más alto introducido es el " + maximo + " y está en la posición " + posicionpositivo + " del array.");
        System.out.println("El número más bajo introducido es el " + minimo + " y está en la posición " + posicionnegativo + " del array.");

    }
}