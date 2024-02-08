package POSTEXAMEN.ARRAYS;
import java.util.Scanner;

public class positivonegativocero {
    public static void main(String[] args) {

        int mediapositivos = 0;
        int positivos = 0;
        int medianegativos = 0;
        int negativos = 0;
        int ceros = 0;

        Scanner sc = new Scanner(System.in);
        int numeros[] = new int[10];

        for(int i = 0; i < 10; i++){
            System.out.println("Dime un numero:");
            numeros[i] = sc.nextInt();
        }

        for(int i = 0; i < 10; i++){
            if(numeros[i] == 0){
                ceros++;
            }

            if(numeros[i] > 0){
                mediapositivos += numeros[i];
                positivos++;
            }

            if(numeros[i] < 0){
                medianegativos += numeros[i];
                negativos++;
            }
        }

        System.out.println("Ha introducido " + ceros + " ceros.");
        if(negativos > 0){
            medianegativos = medianegativos / negativos;
            System.out.println("La media de los numeros negativos es: " + medianegativos);
        }else{
            System.out.println("No ha introducido negativos.");
        }
        if (positivos > 0){   
            mediapositivos = mediapositivos / positivos;
            System.out.println("La media de los numeros positivos es: " + mediapositivos);
        }else{
            System.out.println("No ha introducido positivos.");
        }

    }
}
