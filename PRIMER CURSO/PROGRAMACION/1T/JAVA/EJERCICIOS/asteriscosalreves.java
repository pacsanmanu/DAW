import java.util.Scanner;

public class asteriscosalreves {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el numero mas alto de asteriscos a imprimir");
        int numero = sc.nextInt();
        int cantidad = 0;

        for (int i = 0; numero >= i; numero--){
            for(cantidad = numero; cantidad > i; cantidad--){    
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
