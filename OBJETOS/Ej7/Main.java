package Ej7;
import Ej7.Clases.*;

public class Main {
    public static void main(String[] args) {
        
        Camiseta GucciBomba = new Camiseta("Negra", 'M', "Gucci", "Algodón");
        Persona Manuel = new Persona("Manuel", 23, 'S', GucciBomba);
        Camiseta JordanBomba = new Camiseta("Rojo", 'S', "Jordan", "Algodón");

        Manuel.probarCamiseta(JordanBomba);
        boolean quedaBien = Manuel.ponerCamiseta(Manuel);

        if(quedaBien){
            System.out.println("Te queda canela miniño");
        }else{
            System.out.println("Wena camiseta xurra");
        }

    }
}
