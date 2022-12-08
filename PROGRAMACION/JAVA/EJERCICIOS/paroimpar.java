import java.util.Scanner;

public class paroimpar {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero:");
        int numero = sc.nextInt();

        while(numero > 0 || numero < 0){
            if(numero % 2 == 0){
                System.out.println("El numero " + numero + " es par.");
                System.out.println("Introduzca un nuevo numero:");
                numero = sc.nextInt();
            }else{
                System.out.println("El numero " + numero + " es impar.");
                System.out.println("Introduzca un nuevo numero:");
                numero = sc.nextInt();
            }
        }

    }
}
