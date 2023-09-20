import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el numero de inicio");
        int inicio = sc.nextInt();
        System.out.println("Introduzca el numero en que finaliza");
        int fin = sc.nextInt();

        long factorial = 1;

        for (int n = 1; n <= fin; n++){
            factorial *= n;
            if(n >= inicio){   
                System.out.println(n+": "+factorial);
            }
        }
        
    }
}
