package POSTEXAMEN.BIDIMENSIONALES;
import java.util.Arrays;

public class ej2sumarmatrices {
    public static void main(String[] args) {
        
        int[][] matriz1 = {{1,2,3},{4,4,4},{9,0,9}};
        int[][] matriz2 = {{3,2,1},{0,-3,7},{1,2,3}};
        int[][] suma = new int[3][3];

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                suma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        for(int i = 0; i < 3; i++){
            System.out.println(Arrays.toString(suma[i]));
        }

    }
}
