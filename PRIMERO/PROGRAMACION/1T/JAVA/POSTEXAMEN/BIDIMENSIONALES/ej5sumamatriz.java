package POSTEXAMEN.BIDIMENSIONALES;

import java.util.Arrays;

public class ej5sumamatriz {
    public static void main(String[] args) {
        
        int[][] matriz = new int[10][10];
        int sumafila = 0;
        int sumacolumna = 0;

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                matriz[i][j] = (int)(Math.random() * 10);
            }
        }

        for(int i = 0; i < matriz.length; i++){
            System.out.println(Arrays.toString(matriz[i]));
        }
        System.out.println("");

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                sumafila += matriz[i][j];
            }
            System.out.println("La fila " + i + " suma en total " + sumafila + ".");
            sumafila = 0;

            for(int j = 0; j < matriz.length; j++){
                sumacolumna += matriz[j][i];
            }
            System.out.println("La columna " + i + " suma en total " + sumacolumna + ".");
            sumacolumna = 0;
            System.out.println("");

        }

    }
}
