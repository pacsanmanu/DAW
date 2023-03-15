package Ej20.Clases;

import java.util.ArrayList;

public class Barco {
    private String nombre;
    private String tipo;
    private int capacidadPasajeros;
    private ArrayList<Tripulante> tripulantes= new ArrayList<Tripulante>();
    private GPS gps;
    private ArrayList<Sala> Salas = new ArrayList<Sala>();

    public Barco(String nombre, String tipo, int capacidadPasajeros){
        this.nombre = nombre;
        this.tipo = tipo;
        this.capacidadPasajeros = capacidadPasajeros;
        this.Salas = new ArrayList<Sala>();
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getTipo(){
        return this.tipo;
    }

    public int getCapacidadPasajeros(){
        return this.capacidadPasajeros;
    }

    public ArrayList<Tripulante> getTripulantes(){
        return this.tripulantes;
    }
    
    public GPS getGps() {
        return gps;
    }

    public ArrayList<Sala> getSalas() {
        return Salas;
    }

    public void setTripulantes(ArrayList<Tripulante> tripulantes) {
        this.tripulantes = tripulantes;
    }
    
    public void setGps(GPS gps) {
        this.gps = gps;
    }
    
    public GPS getGPS(){
        return this.gps;
    }
    
    public void addTripulante(Tripulante tripulante){
        tripulantes.add(tripulante);
    }

    public void addSala(Sala sala){
        getSalas().add(sala);
    }

}
