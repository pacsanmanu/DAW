import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class imprimirnumeros {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int media = 0;
        int positivos = 0;
        int negativos = 0;

        System.out.println("Introduzca un numero");
        int numero = sc.nextInt();

        List<Integer> numeros = new ArrayList<Integer>();
        int acumulador = 0;
        
        while(numero > 0 || numero < 0){
            numeros.add(numero);
            acumulador++;
            total = total + numero;
            if(numero > 0){
                positivos++;
            }else if(numero < 0){
                negativos++;
            }
            System.out.println("Introduzca otro numero:");
            numero = sc.nextInt();
        }

        media = total / acumulador;
        System.out.println("Los numeros introducidos son: " + numeros);
        System.out.println("Ha introducido un total de " + acumulador + " numeros.");
        System.out.println("La media de todos los numeros que ha introducido es " + media);
        System.out.println("Ha introducido una cantidad de " + positivos + " numeros positivos y " + negativos + " numeros negativos.");
    }
}
