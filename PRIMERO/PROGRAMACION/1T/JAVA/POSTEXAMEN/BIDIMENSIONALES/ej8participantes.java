package POSTEXAMEN.BIDIMENSIONALES;
import java.util.Scanner;
import java.util.Arrays;

public class ej8participantes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        String[][] lista = new String[10][5];
        String[][] aux = new String[1][5];

        int contadorparticipantes = 0;

        System.out.println("Elija una opción del menú:");
        System.out.println("");
        System.out.println("\t1. Inscrbir un participante.");
        System.out.println("\t2. Mostrar listado por dorsal.");
        System.out.println("\t3. Mostrar listado por marcas.");
        System.out.println("\t4. Finalizar el programa.");

        int eleccion = sc.nextInt();

        do{
            
            if(eleccion == 1){

            if(contadorparticipantes < 10){

                System.out.println("Introduzca el nombre:");
                lista[contadorparticipantes][0] = sc.next();
                
                System.out.println("Introduzca el dorsal:");
                lista[contadorparticipantes][1] = sc.next();
                
                System.out.println("Introduzca la mejor marca del 2002:");
                lista[contadorparticipantes][2] = sc.next();

                System.out.println("Introduzca la mejor marca del 2001:");
                lista[contadorparticipantes][3] = sc.next();
                
                System.out.println("Introduzca la mejor marca del 2000:");
                lista[contadorparticipantes][4] = sc.next();
                                
                System.out.println("Ha introducido al participante " + lista[contadorparticipantes][0] + " cuyo dorsal es " + lista[contadorparticipantes][1] + " y sus marcas son " + lista[contadorparticipantes][2] + " en 2002, " + lista[contadorparticipantes][3] + " en 2001 y " + lista[contadorparticipantes][4] + " en el año 200.");
                
                contadorparticipantes++;
                
            }else{
                System.out.println("Ya ha alcanzado el límite de participantes");
            }

        }else if(eleccion == 2){
            
            for(int i = 0; i < contadorparticipantes - 1; i++){
                for(int j = contadorparticipantes - 1; j > i; j--){
                    if(Integer.parseInt(lista[j-1][1]) > Integer.parseInt(lista[j][1])){
                        aux[0] = lista[j-1];
                        lista[j-1] = lista[j];
                        lista[j] = aux[0];
                    }
                }
            }

            for(int i = 0; i < contadorparticipantes; i++){
                    System.out.println(Arrays.toString(lista[i]));
            }
            
        }else if(eleccion == 3){
            
            for(int i = 0; i < contadorparticipantes - 1; i++){
                for(int j = i; j > 0; j--){
                    if(Integer.parseInt(lista[j-1][2]) > Integer.parseInt(lista[j][2])){
                        aux[0] = lista[j-1];
                        lista[j-1] = lista[j];
                        lista[j] = aux[0];
                    }
                }
            }

            for(int i = 0; i < contadorparticipantes; i++){
                    System.out.println(Arrays.toString(lista[i]));
            }

        }

        System.out.println("Elija una nueva opción del menú:");
        System.out.println("");
        System.out.println("\t1. Inscrbir un participante.");
        System.out.println("\t2. Mostrar listado por dorsal.");
        System.out.println("\t3. Mostrar listado por marcas.");
        System.out.println("\t4. Finalizar el programa.");

        eleccion = sc.nextInt();

    }while(eleccion != 4);
        
    }
}
