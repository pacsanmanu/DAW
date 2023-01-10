package POSTEXAMEN.BASICOS;

public class Ej15 {
    public static void main(String[] args) {
        
        /* 15. Declara e inicializa una variable lógica que indique si el array anterior contiene el
        elemento 0. */

        boolean contiene = true;

        int[] impares = new int[10];
        int numero = 1;

        for(int i = 0; i < impares.length; i++){
            do{
                if(numero % 2 != 0){
                    impares[i] = numero;
                    numero++;
                }else{
                    numero++;
                }
            }while(numero % 2 != 0);
        }

        for(int i = 0; i < impares.length; i++){
            if(impares[i] == 0){
                contiene = false;
            }
        }

        System.out.println(contiene);

    }
}
