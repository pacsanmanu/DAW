package POSTEXAMEN.BIDIMENSIONALES;

public class ej6matriz8x6 {
    public static void main(String[] args) {
        
        int[][] matriz = new int[8][6];

        for(int i = 0; i < matriz.length ; i++){
            for(int j = 0; j < matriz[j].length ; j++){
                if(j == matriz[j].length - matriz[j].length || j == matriz[j].length - 1 || i == matriz.length - matriz.length || i == matriz.length - 1){
                    System.out.print("1  ");
                }else{
                    System.out.print("0  ");
                }
            }
            System.out.println("");
        }

    }
}
