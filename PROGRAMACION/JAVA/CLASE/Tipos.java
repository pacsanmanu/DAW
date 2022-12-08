import java.time.LocalDate;

public class Tipos {
    public static void main(String[] args) {

        //Tipos de datos primitivos

        boolean binario = true; //O false.
        char caracterr = 'A'; //Es un caracter, se cierra con comillas simples.
        //Numeros enteros
        byte d = 1;
        short s = 2;
        int i = 5;
        long l = 4;
        //Numeros decimales
        float f = (float) 6.7; //Tambien se puede poner como 6.7f para obligar que se convierta en float.
        double e = 8.9;

        d++; //Es lo mismo que d = d + 1;

        Double numero = 3.14;

        caracterr++; //Le suma 1 al tipo de dato que sea, aqui pasa al siguiente caracter.
        
        boolean resultado = numero.equals(3.14); //Compara si los 2 numeros son iguales y devuelve true o false.

        double otroNumero = numero.doubleValue(); //Transforma un objeto double en un double primitivo.

        int entero = 6;
        Integer entero2 = 8;

        int result = entero2.compareTo(9); //Compara un objeto con otro. Si son iguales, devuelve 0.

        char caracter = 'A'; //Para los char se usan comillas simples.
        char caracterDos = (byte)65; //El mismo caracter pero puesto en bytes, ver en tabla ASCII.

        boolean result2 = caracter == caracterDos; //Comprueba si los caracteres son los mismos.

        byte b = Byte.MAX_VALUE; //Constante que almacena el Byte mas alto a nuestra variable.
        byte c = Byte.MIN_VALUE; //Igual pero el minimo.

        LocalDate fecha = LocalDate.now(); //Saca la fecha actual del sistema en formato Date.

        String cadena = "Hola, hoy es el dia " + fecha.toString(); //Cadena de texto donde transformamos el objeto Date en un string.
        char CaracterCadena = cadena.charAt(3); //Saca el caracter en la posicion 3 de la cadena.
        
        String SubCadena = cadena.substring(0, 7); //Crea una subcadena e indicamos el inicio y final de la misma.

    }
}
