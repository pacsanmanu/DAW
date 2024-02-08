public class siesnumero {
    public static void main(String[] args) {
        
    char caracter = args[0].charAt(0);

    if (caracter >= 48 && caracter <= 57){
        System.out.println("El caracter introducido es un número");
    }
    else{
        System.out.println("El caracter introducido no es un número");
    }
    }
}

