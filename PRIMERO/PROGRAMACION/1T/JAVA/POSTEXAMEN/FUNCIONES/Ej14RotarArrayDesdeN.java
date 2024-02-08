package POSTEXAMEN.FUNCIONES;
import java.util.Arrays;

public class Ej14RotarArrayDesdeN {

    public static int RotarYGuardar(int[] array, int numero, int posicion){
        int aux = 0;
        for(int j = array.length - 1; j > posicion; j--){    
            if(j == array.length - 1){
                aux = array[j];
            }
            array[j] = array[j - 1];
        }
        array[posicion] = numero;
        return aux;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(RotarYGuardar(arr, 25, 5));
        System.out.println(Arrays.toString(arr));
    }
}
