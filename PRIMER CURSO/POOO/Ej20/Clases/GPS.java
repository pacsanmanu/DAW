package Ej20.Clases;

import java.time.LocalDate;

public class GPS {
    private double coordenadaX;
    private double coordenadaY;
    private LocalDate fecha;

    public GPS(double coordenadaX, double coordenadaY, LocalDate fecha){
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
        this.fecha = fecha;
    }

    public void setCoordenadaX(double coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public void setCoordenadaY(double coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double getCoordenadaX() {
        return coordenadaX;
    }

    public double getCoordenadaY() {
        return coordenadaY;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        return "GPS [coordenadaX=" + coordenadaX + ", coordenadaY=" + coordenadaY + ", fecha=" + fecha + "]";
    }

    

    
}
