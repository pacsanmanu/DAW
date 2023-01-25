package Clases;

public class Dimension {
    private double alto;
    private double ancho;
    private double profundidad;

    public Dimension(){
        this.alto = 0;
        this.ancho = 0;
        this.profundidad = 0;
    }

    public Dimension(double alto, double ancho, double profundidad){
        this.alto = alto;
        this.ancho = ancho;
        this.profundidad = profundidad;
    }

    public void setAncho(double ancho){
        this.ancho = ancho;
    }

    public double getAncho(){
        return this.ancho;
    }
}
