package POSTEXAMEN.PRACTICA;

public class Repaso2 {
    public static void main(String[] args) {

        /* Write a program to find the index of an array element */

        int[] arr = {2,7,8,3,5,6,9,0,1,4};
        int posicion = 0;
        int valor = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == valor){
                posicion = i;
            }
        }

        System.out.println("El valor " + valor + " está en la posición " + posicion);

    }
}
