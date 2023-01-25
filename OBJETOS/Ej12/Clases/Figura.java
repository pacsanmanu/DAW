package Clases;

import Clases.*;

public class Figura {
    private String codigo;
    private double precio;
    private Superheroe superheroe;
    private Dimension dimension;

    public Figura(String codigo, double precio, Superheroe superheroe, Dimension dimension){
        this.codigo = codigo;
        this.precio = precio;
        this.superheroe = superheroe;
        this.dimension = dimension;
    }

    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

    public String getCodigo(){
        return this.codigo;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }

    public double getPrecio(){
        return this.precio;
    }

    public void setSuperheroe(Superheroe superheroe){
        this.superheroe = superheroe;
    }

    public Superheroe getSuperheroe(){
        return this.superheroe;
    }

    public void setDimension(Dimension dimension){
        this.dimension = dimension;
    }

    public Dimension getDimension(){
        return this.dimension;
    }

    public void subirPrecio(double subida){
        this.precio += subida;
    }


    @Override
    public String toString(){
        return this.codigo + " - " + this.precio + " - " + this.superheroe + " - " + this.dimension;
    }
}
