package Ej5.Clases;
import Ej5.Clases.*;

public class Pixel {
    public double x;
    public double y;
    public Enumerados.Colores color;

    public Pixel(double x, double y, Enumerados.Colores color){
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public double getX(){
        return this.x;
    }

    public double getY(){
        return this.y;
    }

    public Enumerados.Colores getColor(){
        return this.color;
    }

    public void setX(double x){
        this.x = x;
    }

    public void setY(double y){
        this.y = y;
    }

    public void setColor(Enumerados.Colores color){
        this.color = color;
    }

    public String toString(){
        return "(" +  this.getX() + "," + this.getY() + ") " + color;
    }

}