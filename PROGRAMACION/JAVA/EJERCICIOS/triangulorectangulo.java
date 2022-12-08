import java.util.Scanner;

public class triangulorectangulo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el numero mas alto de asteriscos a imprimir. El minimo es 4.");
        int numero = sc.nextInt();

        if(numero < 4){
        System.out.println("Introduzca un numero mayor. El mínimo es 4");
        numero = sc.nextInt();
        }
        
        int cantidad = 0;

        for (int i = 1; i <= numero; i++){
            for(cantidad = 0; cantidad < i; cantidad++){    
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
