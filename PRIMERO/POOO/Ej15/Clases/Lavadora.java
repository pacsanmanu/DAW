package Ej15.Clases;

public class Lavadora extends Electrodomestico {
    protected double precio;
    protected boolean aguaCaliente;

    public Lavadora(String marca, double potencia){
        super("Lavadora", marca, potencia);
        this.aguaCaliente = false;
        this.precio = 0;
    }

    public Lavadora(String marca, double precio, double potencia, boolean aguaCaliente){
        super("Lavadora", marca, potencia);
        this.precio = precio;
        this.aguaCaliente = aguaCaliente;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }

    public double getPrecio(){
        return this.precio;
    }

    public String modoFuncionamiento(){
        if(this.aguaCaliente){
            return "Agua caliente";
        }else{
            return "Agua fría";
        }
    }

    @Override
    public double getConsumo(int horas){
        if(this.aguaCaliente){
           return horas * (getPotencia() + getPotencia() * 0.20); 
        }else{
            return horas * getPotencia();
        }
    }

    @Override
    public String toString(){
        return "[" + getTipo() + ", " + getMarca() + ", " + getPrecio() + ", " + getPotencia() + ", " + modoFuncionamiento() + "]";
    }
    
}