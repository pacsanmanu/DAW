package Ej19.Clases;

import java.time.LocalDate;

public abstract class Servicio {
    private Persona persona;
    private LocalDate fechaInicio;
    private String cliente;

    public Servicio(Persona persona, LocalDate fechaInicio, String cliente){
        this.persona = persona;
        this.fechaInicio = fechaInicio;
        this.cliente = cliente;
    }

    public Persona getPersona(){
        return this.persona;
    }

    public void setPersona(Persona persona){
        this.persona = persona;
    }

    public LocalDate getFechaInicio(){
        return this.fechaInicio;
    }

    public void setFechaInicio(LocalDate fechainicio){
        this.fechaInicio = fechainicio;
    }

    public String getCliente(){
        return this.cliente;
    }

    public void setCliente(String cliente){
        this.cliente = cliente;
    }

    public abstract double costeMaterial();

    public abstract double costeManoObra();

    public abstract double costeTotal();

    public abstract String detalleServicio();

    @Override
    public String toString(){
        return "[ " + getPersona() + ", " + getFechaInicio() + ", " + getCliente() + "]"; 
    }

}
