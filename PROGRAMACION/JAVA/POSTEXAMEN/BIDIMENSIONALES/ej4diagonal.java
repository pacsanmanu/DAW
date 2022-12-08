package POSTEXAMEN.BIDIMENSIONALES;
import java.util.Arrays;
import java.util.Scanner;

public class ej4diagonal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("De que dimension quieres que sea la matriz?");
        int n = sc.nextInt();

        int[][] array = new int [n][n];

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                if(i == j){
                    array[i][j] = 1;
                }else{
                    array[i][j] = 0;
                }
            }
        }

        for(int i = 0; i < array.length; i++){
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
