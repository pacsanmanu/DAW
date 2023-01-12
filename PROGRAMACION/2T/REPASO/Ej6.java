import java.util.Scanner;
public class Ej6 {

    /*First Caesar shift is applied using an incrementing number:
    If String is AAA and starting number is 4 then output will be EFG.
    A + 4 = E
    A + 4 + 1 = F
    A + 4 + 1 + 1 = G

    Now map EFG to first ROTOR such as:
    ABCDEFGHIJKLMNOPQRSTUVWXYZ
    BDFHJLCPRTXVZNYEIWGAKMUSQO
    So EFG becomes JLC. Then it is passed through 2 more rotors to get the final value.

    If the second ROTOR is AJDKSIRUXBLHWTMCQGZNPYFVOE, we apply the substitution step again thus:
    ABCDEFGHIJKLMNOPQRSTUVWXYZ
    AJDKSIRUXBLHWTMCQGZNPYFVOE
    So JLC becomes BHD.

    If the third ROTOR is EKMFLGDQVZNTOWYHXUSPAIBRCJ, then the final substitution is:
    ABCDEFGHIJKLMNOPQRSTUVWXYZ
    EKMFLGDQVZNTOWYHXUSPAIBRCJ
    So BHD becomes KQF.

    Final output is sent via Radio Transmitter. */
    public static void main(String[] args) {
        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String resultado = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Que metodo?");
        String opcion = sc.next();
        System.out.println("Que shift?");
        int shift = sc.nextInt();
        System.out.println("Primer rotor?");
        String rotor1 = sc.next();  
        System.out.println("Segundo rotor?");
        String rotor2 = sc.next();  
        System.out.println("Tercer rotor?");
        String rotor3 = sc.next();  
        System.out.println("Mensaje?");
        String mensaje = sc.next();

        if(opcion.equalsIgnoreCase("ENCODE")){
            resultado = encodeCesar(shift, mensaje);
            resultado = rotor(resultado, rotor1, abc);
            resultado = rotor(resultado, rotor2, abc);
            resultado = rotor(resultado, rotor3, abc);
            System.out.println(resultado);
        }else if(opcion.equalsIgnoreCase("DECODE")){
            resultado = desrotor(mensaje, rotor3, abc);
            resultado = desrotor(resultado, rotor2, abc);
            resultado = desrotor(resultado, rotor1, abc);
            resultado = decodeCesar(shift, resultado);
            System.out.println(resultado);
        }
    }

    public static String decodeCesar(int N, String mensaje){

        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String aux = "";
        int contador = 0;
        int coñazo = 0;

        for(int i = 0; i < mensaje.length(); i++){
            for(int j = 0; j < abc.length(); j++){
                if(mensaje.charAt(i) == abc.charAt(j)){
                    coñazo = j - N - contador;
                    if(coñazo < 0){
                        do{
                            coñazo += abc.length();
                        }while(coñazo < 0);
                    }
                    aux += abc.charAt(coñazo);
                    contador++;
                }
            }
        }
        return aux;
    }

    public static String encodeCesar(int N, String mensaje){

        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String aux = "";
        int contador = 0;
        int coñazo = 0;

        for(int i = 0; i < mensaje.length(); i++){
            for(int j = 0; j < abc.length(); j++){
                if(mensaje.charAt(i) == abc.charAt(j)){
                    coñazo = j + N + contador;
                        while(coñazo >= abc.length()){
                            coñazo -= abc.length();
                        }
                    aux += abc.charAt(coñazo);
                    contador++;
                }
            }
        }
        return aux;
    }

    public static String rotor(String mensaje, String rotor, String abcorotor){
        String aux = "";

        for(int i = 0; i < mensaje.length(); i++){
            for(int j = 0; j < abcorotor.length(); j++){
                if(mensaje.charAt(i) == abcorotor.charAt(j)){
                    aux += rotor.charAt(j);
                }
            }
        }

        return aux;
    }

    public static String desrotor(String mensaje, String rotor, String abcorotor){
        String aux = "";

        for(int i = 0; i < mensaje.length(); i++){
            for(int j = 0; j < abcorotor.length(); j++){
                if(mensaje.charAt(i) == rotor.charAt(j)){
                    aux += abcorotor.charAt(j);
                }
            }
        }

        return aux;
    }
}
