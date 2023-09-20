package Ej19.Clases;

import java.time.LocalDate;

public class RevisionAlarma extends Servicio{
    private int numeroAlarmas;

    public RevisionAlarma(Persona persona, LocalDate fechainicio, String cliente, int numeroalarmas){
        super(persona, fechainicio, cliente);
        Persona trabajador = new Persona("Revisor Especialista Contraincendios", "Tito");
        this.numeroAlarmas = numeroalarmas;
        this.setPersona(trabajador);
    }
    
    public void setNumeroAlarmas(int numero){
        this.numeroAlarmas = numero;
    }
    public int getNumeroAlarmas(){
        return this.numeroAlarmas;
    }

    @Override
    public double costeMaterial(){
        return 0;
    }

    @Override
    public double costeManoObra(){
        return (getNumeroAlarmas() / 3) * 40;
    }

    @Override
    public double costeTotal(){
        return costeManoObra();
    }

    @Override
    public String detalleServicio(){
        String detalle = "";
        detalle += "REVISIÓN PERIÓDICA ALARMAS CONTRAINCENDIOS\n";
        detalle += "Cliente: " + getCliente() + "\n";
        detalle += "Fecha revisión: " + getFechaInicio() + "\n";
        detalle += "---------------------------------------------\n";
        detalle += "TOTAL: " + Math.round((costeTotal()*100)/100) + "\n";
        detalle += "---------------------------------------------";
        return detalle;
    }
}
