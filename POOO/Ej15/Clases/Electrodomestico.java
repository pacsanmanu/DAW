package Ej15.Clases;

public class Electrodomestico {
    protected String tipo;
    protected String marca;
    protected double potencia;

    public Electrodomestico(String tipo, String marca, double potencia){
        this.tipo = tipo;
        this.marca = marca;
        this.potencia = potencia;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getTipo(){
        return this.tipo;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getMarca(){
        return this.marca;
    }

    public void setPotencia(double potencia){
        this.potencia = potencia;
    }

    public double getPotencia(){
        return this.potencia;
    }

    public double getConsumo(int horas){
        return this.potencia * horas;
    }

    public double getCosteConsumo(int horas, double costePorHora){
        return getConsumo(horas) * costePorHora;
    }

    @Override
    public String toString(){
        return "[" + this.tipo + ", " + this.marca + ", " + this.potencia + "]";
    }
}
