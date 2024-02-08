import java.util.Scanner;

public class adivinarnumero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int contador = 0;
        
        int numero = (int)(Math.random()*100);
        System.out.println("El ordenador ha creado un numero aleatorio entre 0 y 100. Intente adivinarlo en 10 oportunidades.\n");
        System.out.println("Introduzca un numero:");
        int eleccion = sc.nextInt();
        contador++;
        
        while (numero != eleccion && contador < 10){
            if (numero > eleccion){
                contador++;
                System.out.println("El numero introducido no es correcto. El numero es mayor que su elección.");
                System.out.println("Intentelo de nuevo:");
                eleccion = sc.nextInt();
            }else if(numero < eleccion){
                contador++;
                System.out.println("El numero introducido no es correcto. El numero es menor que su elección.");
                System.out.println("Intentelo de nuevo:");
                eleccion = sc.nextInt();
            }
        }

        if(contador < 10){
            System.out.println("Felicidades! Ha adivinado el número en " + contador + " intentos. El numero era " + numero);
        }else{
            System.out.println("Lo siento! El ordenador ha podido contigo. El numero era " + numero);
        }
    }
}
