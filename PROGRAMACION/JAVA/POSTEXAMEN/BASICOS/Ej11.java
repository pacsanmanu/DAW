package POSTEXAMEN.BASICOS;

public class Ej11 {
    public static void main(String[] args) {
        
        /* 11. Crea una nueva cadena de texto como concatenación de todas las anteriores. */

        String cadena = "pepe te huele la boca";
        String junta = cadena.replaceAll(" ", "");
        String pepe = "pepe";
        String mayus = pepe.toUpperCase();
        String paco = "paco";

        String todos = junta + pepe + mayus + paco;

        System.out.println(todos);
    }
}
