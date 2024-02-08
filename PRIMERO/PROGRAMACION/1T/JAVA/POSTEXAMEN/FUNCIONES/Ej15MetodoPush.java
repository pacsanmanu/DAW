package POSTEXAMEN.FUNCIONES;
import java.util.Arrays;

public class Ej15MetodoPush {

    public static int[] push(int[] array, int n){
        int[] array2 = new int[array.length + 1];
        for(int i = 0; i < array.length; i++){
            array2[i] = array[i];
        }
        array2[array2.length - 1] = n;
        return array2;
    }
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        arr = push(arr, 25);
        System.out.println(Arrays.toString(arr));
    }
}
