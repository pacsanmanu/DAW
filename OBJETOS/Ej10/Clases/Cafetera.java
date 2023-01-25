package Ej10.Clases;

public class Cafetera {
    private int capacidadMaxima;
    private int capacidadActual;

    public Cafetera(){
        this.capacidadMaxima = 1000;
        this.capacidadActual = 0;
    }

    public Cafetera(int capacidadMaxima){
        this.capacidadMaxima = capacidadMaxima;
        this.capacidadActual = capacidadMaxima;
    }

    public Cafetera(int capacidadMaxima, int capacidadActual){
        this.capacidadActual = capacidadActual;
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCapacidadActual(){
        return this.capacidadActual;
    }

    public void llenarCafetera(){
        this.capacidadActual = this.capacidadMaxima;
    }

    public void servirTaza(int cantidad){
        if(this.capacidadActual <= cantidad){
            this.vaciarCafetera();
        }else{
            this.capacidadActual -= cantidad;
        }
    }

    public void vaciarCafetera(){
        this.capacidadActual = 0;
    }

    public void agregarCafe(int cantidad){
        if((this.capacidadActual + cantidad) >= this.capacidadMaxima){
            this.llenarCafetera();
        }else{
            this.capacidadActual += cantidad;
        }
    }
}
