package Ej9.Clases;

import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private ArrayList<Mascota> mascotas;
    private int dinero;

    public Equipo(String nombre, ArrayList<Mascota> mascotas){
        this.nombre = nombre;
        this.mascotas = mascotas;
    }

    public boolean setMascota(Mascota mascota){
        if(mascotas.size() < 5){
            return mascotas.add(mascota);
        }
        return false;
    }

    public boolean removeMascota(Mascota mascota){
        if(mascotas.size() > 0){
            mascotas.remove(mascota);
        }
        return false;
    }

    public int mascotasSize(){
        return this.mascotas.size();
    }

    public Mascota getNextMascota(){
        return mascotas.remove(0);
    }

    public void setDinero(int dinero){
        this.dinero = dinero;
    }
    
    public int getDinero(){
        return this.dinero;
    }
}
