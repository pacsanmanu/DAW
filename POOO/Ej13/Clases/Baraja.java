package Ej13.Clases;
import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;

class ComparaCartas implements Comparator<Carta> {
  
    int indexOf(String palo){
        for(int i = 0; i < Baraja.palos.length; i++ ){
            if(palo.equals(Baraja.palos[i])){
                return i;
            }
        }
        return -1;
    }
    // override the compare() method
    public int compare(Carta c1, Carta c2){

        if(indexOf(c1.palo) == indexOf(c2.palo)){
            if(c1.valor > c2.valor){
                return 1;
            }else{
                return -1;
            }
        }else if(indexOf(c1.palo) < indexOf(c2.palo)){
            return -1;
        }else{
            return 1;
        }

        
    }
}

public class Baraja {
    private ArrayList<Carta> cartas;
    int cartasPorPalo = 10;
    public final static String[] palos = {"oro", "copa", "espada", "basto"};

    public Baraja(){
        this.resetear();
    }

    public ArrayList<Carta> getCartas(){
        return this.cartas;
    }

    public void barajar(){
        Collections.shuffle(this.cartas);
    }

    public Carta sacarCarta(){
        int aux = (int)(Math.random() * this.cartas.size());
        return this.cartas.get(aux);
    }

    public void meterCarta(Carta card){
        this.cartas.add(card);
    }

    public void ordenarCartas(){
        Collections.sort(this.cartas, new ComparaCartas());
    }

    public void resetear(){
        this.cartas = new ArrayList<Carta>();

        for(int i = 0; i < palos.length; i++){
            for(int j = 0; j < cartasPorPalo; j++){
                if(j > 6){
                    this.meterCarta(new Carta(j+3, palos[i]));
                }else{
                    this.meterCarta(new Carta(j+1, palos[i]));
                }
            }
        }
    }

}
