package Ej19.Clases;
import java.lang.Math;

import java.time.LocalDate;

public class TrabajoPintura extends Servicio {
    private double superficie;
    private double precioPintura;

    public TrabajoPintura(Persona persona, LocalDate fechainicio, String cliente, double superficie, double preciopintura){
        super(persona, fechainicio, cliente);
        this.superficie = superficie;
        this.precioPintura = preciopintura;
    }

    public double getSuperficie(){
        return this.superficie;
    }

    public void setSuperficie(double superficie){
        this.superficie = superficie;
    }

    public double getPrecioPintura(){
        return this.precioPintura;
    }

    public void setPrecioPintura(double precio){
        this.precioPintura = precio;
    }

    @Override
    public double costeMaterial(){
        return (getSuperficie() / 7.8) * getPrecioPintura();
    }

    @Override
    public double costeManoObra(){
        return (getSuperficie() / 10) * 9.5;
    }

    @Override
    public double costeTotal(){
        if(getSuperficie() < 50){
            return (costeMaterial() + costeManoObra()) + ((costeManoObra() + costeMaterial()) * 0.15);
        }else{
            return costeMaterial() + costeManoObra();
        }
    }

    @Override
    public String detalleServicio(){
        String detalle = "";
        detalle += "TRABAJO DE PINTURA\n";
        detalle += "Cliente: " + getCliente() + "\n";
        detalle += "Fecha de inicio: " + getFechaInicio() + "\n";
        detalle += "---------------------------------------------\n";
        detalle += "Pintor: " + getPersona() + "\n";
        detalle += "Coste material: " + Math.round((costeMaterial()*100)/100) + "\n";
        detalle += "Coste mano de obra: " + Math.round((costeManoObra()*100)/100) + "\n";
        detalle += "TOTAL: " + Math.round((costeTotal()*100)/100) + "\n";
        detalle += "---------------------------------------------";
        return detalle;
    }
}