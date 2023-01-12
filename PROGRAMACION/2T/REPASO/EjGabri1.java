import java.util.Arrays;

public class EjGabri1 {
    public static void main(String[] args) {
        String palabra = "pacosanz";
        char[] caracteres = {'a', 'c', 'z'};
        System.out.println(Arrays.toString(pasarChar(palabra)));
        System.out.println(contarChar(palabra));
        System.out.println(contieneCaracteres(palabra, caracteres));
        System.out.println(Arrays.toString(cadaCaracter(palabra, caracteres)));
    }

    public static char[] pasarChar(String cadena){
        char[] caracteres = new char[cadena.length()];

        for(int i = 0; i < caracteres.length; i++){
            caracteres[i] = cadena.charAt(i);
        }
        return caracteres;
    }

    public static int contarChar(String cadena){

        int contador = 0;
        for(int i = 0; i < cadena.length(); i++){
            contador++;
        }
        return contador;
    }

    public static int contieneCaracteres(String cadena, char[] caracteres){

        int contador = 0;

        for(int i = 0; i < cadena.length(); i++){
            for(int j = 0; j < caracteres.length; j++){
                if(caracteres[j] == cadena.charAt(i)){
                    contador++;
                    caracteres[j] = '0';
                }
            }
        }

        return contador;
    }

    public static int[] cadaCaracter(String cadena, char[] caracteres){

        int contador[] = new int[caracteres.length];

        for(int i = 0; i < cadena.length(); i++){
            for(int j = 0; j < caracteres.length; j++){
                if(caracteres[j] == cadena.charAt(i)){
                    contador[j]++; 
                }
            }
        }

        return contador;
    }
}
