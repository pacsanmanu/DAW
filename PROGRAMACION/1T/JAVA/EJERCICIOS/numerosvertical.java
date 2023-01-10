import java.util.Scanner;

public class numerosvertical {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el numero mas alto a imprimir");
        int numero = sc.nextInt();

        for (int i = 1; i <= numero; i++){
            System.out.println(i);
        }
    }
}
