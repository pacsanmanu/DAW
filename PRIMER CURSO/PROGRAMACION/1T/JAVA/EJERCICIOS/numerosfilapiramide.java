import java.util.Scanner;

public class numerosfilapiramide {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el numero mas alto a imprimir");
        int numero = sc.nextInt();
        int cantidad = 0;

        for (int i = 1; i <= numero; i++){
            for(cantidad = 0; cantidad < i; cantidad++){    
                System.out.print(i);
            }
            System.out.println("");
        }
    }
}