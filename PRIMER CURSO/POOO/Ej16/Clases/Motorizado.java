package Ej16.Clases;

public class Motorizado extends Vehiculo{
    private int consumo;
    private int capacidad;
    private double deposito;
    private boolean arrancado;

    public Motorizado(String marca, int numRuedas, int velocidadMax, int consumo, int capacidad, double deposito){
        super(marca, numRuedas, velocidadMax);
        this.consumo = consumo;
        this.capacidad = capacidad;
        this.deposito = deposito;
        this.arrancado = false;
    }

    public int getConsumo(){
        return this.consumo;
    }

    public int getCapacidad(){
        return this.capacidad;
    }

    public double getDeposito(){
        return this.deposito;
    }

    public void arrancar(){
        this.arrancado = true;
    }

    public void parar(){
        this.arrancado = false;
    }
}
