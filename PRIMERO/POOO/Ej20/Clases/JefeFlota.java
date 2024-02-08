package Ej20.Clases;

public class JefeFlota extends Tripulante{
    public JefeFlota(int numeroCarnet, int edad, int tiempoEmpresa, String nombre){
        super(numeroCarnet, edad, tiempoEmpresa, nombre);
    }

    @Override
    public int sueldo(){
        return 2000;
    }

    @Override
    public String mostrarDato(){
        return "[" + getNombre() + ", " + getNumeroCarnet() + ", " + getEdad() + ", " + getTiempoEmpresa() + "]";
    }
}
