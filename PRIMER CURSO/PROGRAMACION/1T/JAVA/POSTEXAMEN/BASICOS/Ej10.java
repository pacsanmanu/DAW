package POSTEXAMEN.BASICOS;

public class Ej10 {
    public static void main(String[] args) {
        
        /* 10. Declara e inicializa una variable lógica que indique si dos de las cadenas anteriores
        tienen el mismo tamaño. */

        String cadena = "pepe te huele la boca";
        String junta = cadena.replaceAll(" ", "");

        boolean tamaño = true;

        if(cadena.length() != junta.length()){
            tamaño = false;
        }

        System.out.println(tamaño);
    }
}
