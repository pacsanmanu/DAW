package Ej20.Clases;

import java.util.ArrayList;

public class Sala {
    private String nombre;
    private int aforoTotal;
    private ArrayList<Tripulante> tripulantes= new ArrayList<Tripulante>();
    private ArrayList<Tripulante> rangoPermitido= new ArrayList<Tripulante>();

    public Sala(String nombre, int aforoTotal){
        this.nombre = nombre;
        this.aforoTotal = aforoTotal;
        this.tripulantes =  new ArrayList<Tripulante>();
        this.rangoPermitido = new ArrayList<Tripulante>();
    }

    public String getNombre() {
        return nombre;
    }

    public int getAforoTotal() {
        return aforoTotal;
    }

    public ArrayList<Tripulante> getTripulantes() {
        return tripulantes;
    }

    public ArrayList<Tripulante> getRangoPermitido() {
        return rangoPermitido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAforoTotal(int aforoTotal) {
        this.aforoTotal = aforoTotal;
    }

    public void setTripulantes(ArrayList<Tripulante> tripulantes) {
        this.tripulantes = tripulantes;
    }

    public void setRangoPermitido(ArrayList<Tripulante> rangoPermitido) {
        this.rangoPermitido = rangoPermitido;
    }

    public void entrar(Tripulante t){
        for(int i = 0; i < getRangoPermitido().size(); i++){
            if(t.getClass().getSimpleName().equals(this.rangoPermitido.get(i).getClass().getSimpleName())){
                getTripulantes().add(t);
            }
        }
    }

    public void addRango(Tripulante t){
        getRangoPermitido().add(t);
    }

    @Override
    public String toString() {
        return "Sala [nombre=" + nombre + ", aforoTotal=" + aforoTotal + ", tripulantes=" + tripulantes
                + ", rangoPermitido=" + rangoPermitido + "]";
    }
}
