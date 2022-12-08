import java.util.Scanner;

public class numeroperfecto {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el numero que quiera comprobar:");

        int numero = sc.nextInt();
        int acumulador = 0;

        for(int i = 1; i < numero; i++){
            if(numero % i == 0){
                System.out.println("Es divisible entre " + i);
                acumulador += i;
            }
        }

        if(acumulador == numero){
            System.out.println("El numero es perfecto.");
        }else{
            System.out.println("El numero no es perfecto.");
        }
    }
}
