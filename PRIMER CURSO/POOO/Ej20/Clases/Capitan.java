package Ej20.Clases;

public class Capitan extends Tripulante{
    public Capitan(int numeroCarnet, int edad, int tiempoEmpresa, String nombre){
        super(numeroCarnet, edad, tiempoEmpresa, nombre);
    }

    @Override
    public int sueldo(){
        return 1000 + getTiempoEmpresa();
    }

    @Override
    public String mostrarDato(){
        return "[" + getNombre() + ", " + getNumeroCarnet() + ", " + getEdad() + ", " + getTiempoEmpresa() + "]";
    }
}
