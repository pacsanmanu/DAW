import java.util.Scanner;

public class ahorcado {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String jugarmas = "S";

        System.out.println("¡Hola! Bienvenido al juego del ahorcado.");
        
        do{

        System.out.println("Introduzca la palabra a adivinar en el juego.");

        String palabra = sc.nextLine();

        int vidas = 7;

        int longitudpalabra = palabra.length();

        int contadoraciertos = 0;

        System.out.println("Tienes 7 vidas para adivinar la palabra:");

        StringBuilder palabraBuscada = new StringBuilder("");

        System.out.print("\n");
        for (int i = 0; i < longitudpalabra; i++){
            palabraBuscada.append("_");
        }

        System.out.println(palabraBuscada);

        while(vidas > 0 && palabra != palabraBuscada.toString()){

            contadoraciertos = 0;

            System.out.println("Introduzca una letra:");

            char caracterusuario = sc.nextLine().charAt(0);

            for (int i = 0; i < longitudpalabra; i++){
                
                char caracter = palabra.charAt(i);

                if(caracterusuario == caracter){
                    palabraBuscada.setCharAt(i, caracter);
                    contadoraciertos++;
                }
            }

            System.out.println(palabraBuscada);

            if(palabra.equals(palabraBuscada.toString())){
                System.out.println("Felicidades!! Has conseguido adivinar la palabra.");
                break;
            }else{
                if (contadoraciertos > 0){
                    System.out.println("Le siguen quedando " + vidas + " vidas.");
                }else{
                    vidas = vidas - 1;
                    System.out.println("Ha perdido una vida. Le quedan " + vidas);
                }
            }
        }
        
        if(vidas == 0){
            System.out.println("Ohhh! Te has quedado sin vidas. La palabra a adivinar era " + palabra + ". ¿Quieres volver a jugar? (S/n)");
        }else{
            System.out.println("¿Quieres volver a jugar? (S/n)");
        }
        jugarmas = sc.nextLine();

    }while(jugarmas.equals("S") || jugarmas.equals("s"));

    }
}
