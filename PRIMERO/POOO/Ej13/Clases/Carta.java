package Ej13.Clases;

public class Carta {
    public int valor;
    public String palo;
    
    public Carta(int valor, String palo){
        this.valor = valor;
        this.palo = palo;
    }

    @Override
    public String toString(){
        return this.valor + " de " + this.palo;
    }
}
