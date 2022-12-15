package POSTEXAMEN.BASICOS;

public class Ej9 {
    public static void main(String[] args) {
        
        /* 9. Crea una nueva cadena de texto como resultado de eliminar los espacios en blanco de la
        anterior. */

        String cadena = "pepe te huele la boca";
        String junta = cadena.replaceAll(" ", "");

        System.out.println(junta);
    }
}
