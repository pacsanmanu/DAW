package Ej6.Clases;

import java.util.Date;

public class Jugador {
    public String Nombre;
    public int Dorsal;
    public String NombreEquipo;
    public int NumeroTarjetasAmarillas;
    public int NumeroTarjetasRojas;
    public String Nacionalidad;
    public Date FechaNacimiento; 
    public String Posicion;

    public Jugador(String Nombre, Date FechaNacimiento, String Nacionalidad, String Posicion, int Dorsal, String NombreEquipo){
        this.Nombre = Nombre;
        this.FechaNacimiento = FechaNacimiento;
        this.Nacionalidad = Nacionalidad;
        this.Posicion = Posicion;
        this.Dorsal = Dorsal;
        this.NombreEquipo = NombreEquipo;
    }

    public String getNombre(){
        return this.Nombre;
    }

    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }

    public int getDorsal(){
        return this.Dorsal;
    }

    public void setDorsal(int Dorsal){
        this.Dorsal = Dorsal;
    }

    public String getNombreEquipo(){
        return this.NombreEquipo;
    }

    public void SetNombreEquipo(String NombreEquipo){
        this.NombreEquipo = NombreEquipo;
    }

    public int getNumeroTarjetasAmarillas(){
        return this.NumeroTarjetasAmarillas;
    }

    public void setNumeroTarjetasAmarillas(int NumeroTarjetasAmarillas){
        this.NumeroTarjetasAmarillas = NumeroTarjetasAmarillas;
    }

    public int getNumeroTarjetasRojas(){
        return this.NumeroTarjetasRojas;
    }

    public void setNumeroTarjetasRojas(int NumeroTarjetasRojas){
        this.NumeroTarjetasRojas = NumeroTarjetasRojas;
    }
    
    public String getNacionalidad(){
        return this.Nacionalidad;
    }

    public void setNacionalidad(String Nacionalidad){
        this.Nacionalidad = Nacionalidad;
    }

    public Date getFechaNacimiento(){
        return this.FechaNacimiento;
    }

    public void setFechaNacimiento(Date FechaNacimiento){
        this.FechaNacimiento = FechaNacimiento;
    }

    public String getPosicion(){
        return this.Posicion;
    }

    public void setPosicion(String Posicion){
        this.Posicion = Posicion;
    }

    public String toString(){
        return this.Nombre + ", " + this.Dorsal + ", " + this.NombreEquipo + ", " + this.NumeroTarjetasAmarillas + ", " + this.NumeroTarjetasRojas + ", " + this.Nacionalidad + ", " + this.FechaNacimiento + ", " + this.Posicion;
    }

}