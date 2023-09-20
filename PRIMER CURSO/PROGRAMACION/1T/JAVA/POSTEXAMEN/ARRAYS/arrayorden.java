package POSTEXAMEN.ARRAYS;
import java.util.Scanner;

public class arrayorden {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[] array = new int[10];
        boolean creciente = true;
        boolean decreciente = true;

        for(int i = 0; i < array.length; i++){
            System.out.println("Dime un numero:");
            array[i] = sc.nextInt();
        }

        for(int i = 0; i < array.length - 1; i++){
            if(array[i] < array[i + 1]){
                decreciente = false;
            }else if(array[i] > array[i + 1]){
                creciente = false;
            }
        }

        if(creciente && decreciente){
            System.out.println("Los números son todos iguales.");
        }else if(creciente){
            System.out.println("El orden es creciente.");
        }else if(decreciente){
            System.out.println("El orden es decreciente.");
        }else{
            System.out.println("Los números no están ordenados.");
        }

        System.out.println("De qué manera quieres ordenarlo?");
        System.out.println("1. Creciente");
        System.out.println("2. Decreciente");
        int eleccion = sc.nextInt();

        if(eleccion == 1){
            int[] arrayordenado = new int[10];
        }else if(eleccion == 2){
            int[] arrayordenado = new int[10];
            //Terminar el ejercicio
        }else{
            System.out.println("Introduzca una elección válida.");
        }
    }
}
