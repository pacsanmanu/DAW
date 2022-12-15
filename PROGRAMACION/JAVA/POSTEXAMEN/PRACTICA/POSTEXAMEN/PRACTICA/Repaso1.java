package POSTEXAMEN.PRACTICA;

public class Repaso1 {
    public static void main(String[] args) {
        
        /* Write a java program to test if an array contains a specific value */

        String[] arr = {"A", "B", "C", "D", "E"};
        boolean contiene = false;
        String valor = "B";

        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals(valor)){
                contiene = true;
            }
        }

        if(contiene){
            System.out.println("Contiene el valor");
        }else{
            System.out.println("No lo contiene");
        }
    }
}
