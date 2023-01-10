public class siesmayuscula {
    public static void main(String[] args) {
        char caracter = args[0].charAt(0);

        if (caracter >= 65 && caracter <= 90){
            System.out.println("El caracter introducido es una mayúscula");
        }else{
            System.out.println("El caracter introducido no es una mayúscula");
        }
    }
}
