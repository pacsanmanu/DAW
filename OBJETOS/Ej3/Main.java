package Ej3;

import java.util.Arrays;
import Ej3.Clases.*;

public class Main {
public static void main(String[] args) {
    
    Carta[] cartas = new Carta[10];
    float num;
    
    for(int i = 0; i < cartas.length; i++){
        Carta micarta = new Carta();
        micarta.valor = i + 1;
        micarta.palo = "picas";
        cartas[i] = micarta;
    }

    mostrarCartas(cartas);
    }

    public static void mostrarCartas(Carta[] cartas){
        for(int i = 0; i < cartas.length; i++){
            System.out.print(cartas[i].valor);
            System.out.print(" de ");
            System.out.println(cartas[i].palo);
        }
    }
    
}