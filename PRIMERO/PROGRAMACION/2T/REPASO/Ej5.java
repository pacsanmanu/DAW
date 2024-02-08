public class Ej5 {
    public static void main(String[] args) {
        String cadena = "vivaelbeti";
        String cifrado = cifradoCesar(cadena);
        String descifrado = descifradoCesar(cifrado);
        System.out.println(cifrado);
        System.out.println(descifrado);
    }

    public static String cifradoCesar(String cadena){
        String aux = "";
        int numaux = 0;
        char caracter = ' ';
        for(int i = 0; i < cadena.length(); i++){
            caracter = cadena.charAt(i);
            if(caracter > 119){
                numaux = caracter - 23;
                caracter = (char)numaux;
                aux += caracter;
            }else{
                numaux = caracter + 3;
                caracter = (char)numaux;
                aux += caracter;
            }
        }
        return aux;
    }

    public static String descifradoCesar(String cadena){
        String aux = "";
        int numaux = 0;
        char caracter = ' ';
        for(int i = 0; i < cadena.length(); i++){
            caracter = cadena.charAt(i);
            if(caracter < 100){
                numaux = caracter + 23;
                caracter = (char)numaux;
                aux += caracter;
            }else{
                numaux = caracter - 3;
                caracter = (char)numaux;
                aux += caracter;
            }
        }
        return aux;
    }

}
