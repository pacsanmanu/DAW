package Ej16.Clases;

public class Vehiculo {
    private String marca;
    private int numRuedas;
    private int velocidadMax;

    public Vehiculo(String marca, int numRuedas, int velocidadMax){
        this.marca = marca;
        this.numRuedas = numRuedas;
        this.velocidadMax = velocidadMax;
    }

    public String getMarca(){
        return this.marca;
    }

    public int getNumRuedas(){
        return this.numRuedas;
    }

    public int getVelocidadMax(){
        return this.velocidadMax;
    }

    @Override
    public String toString(){
        return "[" + getMarca() + ", " + getNumRuedas() + ", " + getVelocidadMax() + "]";
    }
}
