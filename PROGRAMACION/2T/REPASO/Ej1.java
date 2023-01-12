import java.util.Scanner;

public class Ej1 {

        /*
        * Crea una función que evalúe si un/a atleta ha superado correctamente una
        * carrera de obstáculos.
        * - La función recibirá dos parámetros:
        *      - Un array que sólo puede contener String con las palabras
        *        "run" o "jump"
        *      - Un String que represente la pista y sólo puede contener "_" (suelo)
        *        o "|" (valla)
        * - La función imprimirá cómo ha finalizado la carrera:
        *      - Si el/a atleta hace "run" en "_" (suelo) y "jump" en "|" (valla)
        *        será correcto y no variará el símbolo de esa parte de la pista.
        *      - Si hace "jump" en "_" (suelo), se variará la pista por "x".
        *      - Si hace "run" en "|" (valla), se variará la pista por "/".
        * - La función retornará un Boolean que indique si ha superado la carrera.
        * Para ello tiene que realizar la opción correcta en cada tramo de la pista.
        */
    
    public static boolean pass(String[] moves, String pista){

        boolean resultado = true;
        String pistafinal = "";
        
        for(int i = 0; i < moves.length; i++){
            
            if(moves[i].equals("run")){
                if(pista.charAt(i) != '_'){
                    resultado = false;
                    pistafinal += "/";
                }else{
                    pistafinal += "_";
                }
            }

            if(moves[i].equals("jump")){
                if(pista.charAt(i) != '|'){
                    resultado = false;
                    pistafinal += "x";
                }else{
                    pistafinal += "|";
                }
            }
        }

        System.out.println("\n" + pistafinal);
        return resultado;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String pista = "___|____|_________|___";
        String[] accion = new String[pista.length()];

        for(int i = 0; i < accion.length; i++){
            System.out.println("La pista es " + pista);
            System.out.println("Esta en el movimiento número " + i);
            System.out.println("¿Quiere run o jump?");
            accion[i] = sc.next();
        }

        boolean carrera1 = pass(accion, pista);

        if(carrera1){
            System.out.println("Ha hecho el recorrido perfecto!");
        }else{
            System.out.println("Corre mu bien maricon");
        }
    }
}
