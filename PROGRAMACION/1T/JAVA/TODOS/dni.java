import java.util.Scanner;

public class dni {
    public static void main(String[] args) {

        String[] letras = {"T", "R", "W", "A", "G", "H", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};

        int NumeroUsuario;
        Scanner scanner = new Scanner(System.in); //Recoge el valor que introduce el usuario

        System.out.println("Introduzca su número del DNi");
        NumeroUsuario = scanner.nextInt(); //Aqui se recoge el numero del usuario

        int NumeroDni = division(NumeroUsuario); //Se ejecuta la funcion divison

        System.out.println("Su DNI completo es el " + NumeroUsuario + letras[NumeroDni]); //Se imprime en pantalla el dni concatenando la letra
   
    }

    private static int division(int NumeroDni) { //La variable que he puesto (NumeroDni) se puede llamar de cualquier forma, solo es para indicar que es una variable de tipo entero
       
        int resultado; //Variable donde se almacena el resultado
        resultado = NumeroDni % 23; //Se calcula el resto

        return resultado; //Devuelve el resultado

    }
}
