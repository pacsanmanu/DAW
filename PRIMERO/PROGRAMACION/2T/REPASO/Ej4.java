import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        
        int numero;

        numero = pedirNumero();
        System.out.println(palotes(numero));

    }

    public static int pedirNumero(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Qué numero de palotes quieres imprimir?");
        int numero = sc.nextInt();

        while(!(numero >= 0 && numero < 999)){
            numero = sc.nextInt();
        }
        return numero;
    }

    public static String palotes(int numero){
        System.out.println("Toma palote maquina");
        System.out.println("");

        int centesimas = 0;
        int decimas = 0;
        int unidades = 0;
        String palotes = "";

        if(numero == 0){
            palotes += "-";
        }
        
        if(numero > 100){
            centesimas = numero / 100; 
            numero -= centesimas * 100;
        }

        if(numero > 10){
            decimas = numero / 10;
            numero -= decimas * 10;
        }

        unidades = numero;

        for(int i = 0; i < centesimas; i++){
            palotes += "|";
        }

        if(centesimas > 0){
            palotes += "-";
        }

        for(int i = 0; i < decimas; i++){
            palotes += "|";
        }

        if(decimas > 0){
            palotes += "-";
        }

        for(int i = 0; i < unidades; i++){
            palotes += "|";
        }

        return palotes;
    }
}
