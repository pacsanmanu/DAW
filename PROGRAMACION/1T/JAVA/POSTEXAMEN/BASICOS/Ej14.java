package POSTEXAMEN.BASICOS;
import java.util.Arrays;

public class Ej14 {
    public static void main(String[] args) {
        
        /* 14. Crea un array de enteros llamado “impares” y añade en él los 10 primeros números
        impares. */

        int[] impares = new int[10];
        int numero = 1;

        for(int i = 0; i < impares.length; i++){
            do{
                if(numero % 2 != 0){
                    impares[i] = numero;
                    numero++;
                }else{
                    numero++;
                }
            }while(numero % 2 != 0);
        }

        System.out.println(Arrays.toString(impares));

    }
}
