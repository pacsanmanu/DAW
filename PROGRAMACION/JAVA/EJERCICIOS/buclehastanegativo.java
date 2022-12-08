import java.util.Scanner;

public class buclehastanegativo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero para comprobar si es negativo");
        int numero = sc.nextInt();

        while(numero >= 0){
            System.out.println("El numero " + numero + " no es negativo\n");
            System.out.println("Introduzca un nuevo numero");
            numero = sc.nextInt();
        }

        System.out.println("El numero introducido es negativo");
        
    }
}
