import java.util.Scanner;

public class positivoonegativo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero:");
        int numero = sc.nextInt();

        while(numero > 0 || numero < 0){
            if(numero > 0){
                System.out.println("El numero " + numero + " es positivo.");
                System.out.println("Introduzca un nuevo numero:");
                numero = sc.nextInt();
            }else{
                System.out.println("El numero " + numero + " es negativo.");
                System.out.println("Introduzca un nuevo numero:");
                numero = sc.nextInt();
            }
        }

    }
}
