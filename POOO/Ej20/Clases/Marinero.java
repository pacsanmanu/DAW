package Ej20.Clases;

public class Marinero extends Tripulante{
    private int captura;

    public Marinero(int numeroCarnet, int edad, int tiempoEmpresa, String nombre, int captura){
        super(numeroCarnet, edad, tiempoEmpresa, nombre);
        this.captura = captura;
    }

    public int getCaptura() {
        return captura;
    }

    public void setCaptura(int captura) {
        this.captura = captura;
    }

    @Override
    public int sueldo(){
        return 900 + captura;
    }

    @Override
    public String mostrarDato(){
        return "[" + getNombre() + ", " + getNumeroCarnet() + ", " + getEdad() + ", " + getTiempoEmpresa() + ", " + getCaptura() + "]";
    }

}
