import clases.Carta;

public class Main { 
    public static void main(String[] args) {
        Carta mycarta = new Carta();
        mycarta.valor = 7;
        mycarta.palo = "picas";

        Carta mycarta2 = new Carta();
        mycarta2.valor = 5;
        mycarta2.palo = "corazones";

        mostrarCarta(mycarta);
        mostrarCarta(mycarta2);
    }

    public static void mostrarCarta(Carta carta){
        System.out.println(carta.valor + " de " + carta.palo);
    }   
}
