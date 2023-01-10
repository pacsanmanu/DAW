import java.util.Scanner;

public class tablamultiplicar {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el numero que quiera hacer la tabla de multiplicar");
        int numero = sc.nextInt();
        int multiplicacion = 0;

        for(int i = 1; i <= 10; i++){
            multiplicacion = numero * i;
            System.out.println(multiplicacion);
        }
    }
}
