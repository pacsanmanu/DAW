package POSTEXAMEN.BIDIMENSIONALES;
import java.util.Arrays;

public class ej1 {
    public static void main(String[] args) {
        
        int[][] array = new int[3][3];

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                array[i][j] = (int)(Math.random() * 10);
            }
        }

        for(int i = 0; i < 3; i++){
            System.out.println("");
            System.out.print("[");
            for(int j = 0; j < 3; j++){
                System.out.print(array[i][j]);
                System.out.print(", ");
            }
            System.out.print("]");
        }

    }
}
