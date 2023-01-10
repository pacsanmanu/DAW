import java.util.Scanner;

public class Par_impar {
    public static void main(String[] args) {
        int numeroUsuario;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserte un numero: ");
        numeroUsuario = scanner.nextInt();

        boolean NumeroPar = ComprobarNumeroPar(numeroUsuario);

        if (NumeroPar){
            System.out.println("El número" + numeroUsuario + "es par");
        }
        else{
            System.out.println("El numero" + numeroUsuario + "es impar");
        }
    }

    private static boolean ComprobarNumeroPar(int numeroUsuario){
        boolean resultado = numeroUsuario % 2 == 0;
        return resultado;
    } 
}
