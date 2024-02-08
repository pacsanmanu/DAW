package POSTEXAMEN.FUNCIONES;
import java.util.Arrays;

public class Ej13ArrayYN {

    public static int RotarYGuardar(int[] array, int numero){
        int aux = 0;
        for(int j = array.length - 1; j > 0; j--){    
            if(j == array.length - 1){
                aux = array[j];
            }
            array[j] = array[j - 1];
        }
        array[0] = numero;
        System.out.println(Arrays.toString(array));
        return aux;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(RotarYGuardar(arr, 5));
    }
}
