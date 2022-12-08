import java.util.Scanner;

public class cuadro {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca la longitud de los lados del cuadrado:");
        int longitud = sc.nextInt();
        int contador = 0;
        int lineas = 1;
        
            while (contador < longitud){
                System.out.printf("* ");
                contador++;
                
                if(contador == longitud && lineas < longitud){
                    lineas++;
                    System.out.println("");
                    contador = 0;

                }
            }
    }
}
