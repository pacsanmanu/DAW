package POSTEXAMEN.ARRAYS;
import java.lang.reflect.Array;
import java.util.Scanner;


public class numerosarray {
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        int numeros[] = new int[5];
        
        for(int i = 0; i < 5; i++){
            System.out.println("Dime un numero.");
            int numerousuario = sc.nextInt();
            numeros[i] = numerousuario;
        }

        System.out.println("Los números que has introducido son:");

        for(int j = 4; j >= 0; j--){
            System.out.println(numeros[j]);
        }

    }
        
}
