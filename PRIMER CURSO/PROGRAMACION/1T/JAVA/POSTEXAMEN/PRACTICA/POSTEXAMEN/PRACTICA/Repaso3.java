package POSTEXAMEN.PRACTICA;

public class Repaso3 {
    public static void main(String[] args) {
        
        /* Write a program to find the duplicate values on an array of ints */

        int[] arr = {1,2,3,4,5,6,7,8,9,0,1,3,5,7};
        int[] repes = new int[8];
        int cont = 0;

        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    for(int k = 0; k < repes.length; k++){
                        if(arr[i] == repes[k]){
                            break;
                        }
                        repes[cont] = arr[i];
                        cont++;
                        break;
                    }
                }
            }
        }
    }
}
