package POSTEXAMEN.PRACTICA;
import java.util.Scanner;
import java.util.Arrays; 

    public class Shift {

    public static int metodoShift(int[] array){
        int naux = 0;
        int[] aux = new int[array.length - 1];

        for(int i = 0; i < aux.length; i++){
            aux[i] = array[i + 1];
        }

        naux = array[0];

        System.out.println(Arrays.toString(aux));

        return naux;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] array1 = {1,2,3,4,5,6,7,8,9,10};
        System.out.println((metodoShift(array1)));
    }
}
