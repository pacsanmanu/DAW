import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        char caracter;

        do{
            caracter = leerCaracter();
            vocal(caracter);
        }while(caracter != ' ');
    }

    public static void vocal(char caracter){

        if(caracter == 'a' || caracter == 'e' || caracter == 'i'|| caracter == 'o' || caracter == 'u'){
            System.out.println("Es vocal");
        }else{
            System.out.println("No es vocal");
        }

    }

    public static char leerCaracter(){

        Scanner sc = new Scanner(System.in);
        char caracter;
        System.out.println("Introduce un caracter.");
        String input = sc.nextLine().toLowerCase();
        while(input.length() > 1){
            System.out.println("Lo que ha introducido es mayor a un caracter. Introduzca un caratcer valido.");
            input = sc.nextLine();
        }
        caracter = input.charAt(0);
        return caracter;

    }
}
