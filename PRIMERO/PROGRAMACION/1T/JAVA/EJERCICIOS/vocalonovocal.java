import java.util.Scanner;

public class vocalonovocal {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un caracter: ");
        String caracterintroducido = sc.nextLine();

        char caracter;

        while (!caracterintroducido.equals(" ")){

            caracter = caracterintroducido.toUpperCase().charAt(0);

            if(caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U'){
                System.out.println("El caracter es una vocal.");
            }else{
                System.out.println("El caracter no es una vocal.");
            }

            System.out.println("Introduzca un nuevo caracter: ");
            caracterintroducido = sc.nextLine();

        }
    }
}
