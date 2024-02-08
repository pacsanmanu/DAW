    package POSTEXAMEN.BASICOS;
    
    public class Ej12 {
        public static void main(String[] args) {
            
            /* 12. Declara e inicializa una variable lógica que indique si alguna de las cadenas anteriores
            contiene el carácter ‘C’. */

            String cadena = "pepe te huele la boca";
            String junta = cadena.replaceAll(" ", "");
            String pepe = "pepe";
            String mayus = pepe.toUpperCase();
            String paco = "paco";
    
            String todos = junta + pepe + mayus + paco;

            boolean match = true;

            for(int i = 0; i < todos.length(); i++){
                if(todos.charAt(i) == 'C'){
                    match = false;
                }
            }

            System.out.println(match);

        }
    }
    