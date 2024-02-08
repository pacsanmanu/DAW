package POSTEXAMEN.BASICOS;

public class Ej13 {
    public static void main(String[] args) {
        
        /* 13. Crea una nueva cadena de texto como resultado de sustituir el carácter ‘s’ por el
        carácter ‘$’ en alguna de las cadenas anteriores. */

        String cadena = "pepe te huele la boca muchisimo";
        String junta = cadena.replaceAll(" ", "");
        String pepe = "pepesito";
        String mayus = pepe.toUpperCase();
        String paco = "pacosito";

        String todos = junta + pepe + mayus + paco;

        String remplazado = todos.replace("s", "$");

        System.out.println(remplazado);
    }
}
