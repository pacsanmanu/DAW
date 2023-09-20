package POSTEXAMEN.BIDIMENSIONALES;

public class ej3matrizsimetrica {
    public static void main(String[] args) {
        
        int[][] matriz1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] matriz2 = {{1,4,7},{2,5,8},{3,6,9}};
        int valor1 = 0;
        int valor2 = 0;
        boolean simetricos = true;

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                valor1 = matriz1[i][j];
            }
            for(int j = 0; j < 3; j++){
                valor2 = matriz2[j][i];
            }
            if(valor1 != valor2){
                simetricos = false;
            }
        }

        if(simetricos){
            System.out.println("Ambas matrices son indénticas.");
        }else{
            System.out.println("Las matrices no son idénticas.");
        }

    }
}
