package Ej16.Clases;

public class Patines extends NoMotorizado{
    private String tipo;

    public Patines(String marca, int numRuedas, int velocidadMax, String tipo){
        super(marca, numRuedas, velocidadMax);
        this.tipo = tipo;
    }
}
