package POSTEXAMEN.BASICOS;

public class Ej16 {
    public static void main(String[] args) {
        
        /* 16. Declara e inicializa una variable entera con el valor del 6o elemento del array anterior. */

        int sexto;

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

        sexto = impares[6];

        System.out.println(sexto);

    }
}
