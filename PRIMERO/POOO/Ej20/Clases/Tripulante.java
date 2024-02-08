package Ej20.Clases;

public abstract class Tripulante {
    private int numeroCarnet;
    private int edad;
    private int tiempoEmpresa;
    private String nombre;

    public Tripulante(int numeroCarnet, int edad, int tiempoEmpresa, String nombre){
        this.numeroCarnet = numeroCarnet;
        this.edad = edad;
        this.tiempoEmpresa = tiempoEmpresa;
        this.nombre = nombre;
    }

    public int getNumeroCarnet() {
        return numeroCarnet;
    }

    public int getEdad() {
        return edad;
    }

    public int getTiempoEmpresa() {
        return tiempoEmpresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNumeroCarnet(int numeroCarnet) {
        this.numeroCarnet = numeroCarnet;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setTiempoEmpresa(int tiempoEmpresa) {
        this.tiempoEmpresa = tiempoEmpresa;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract int sueldo();

    public abstract String mostrarDato();

    @Override
    public String toString() {
        return "Tripulante [numeroCarnet=" + numeroCarnet + ", edad=" + edad + ", tiempoEmpresa=" + tiempoEmpresa
                + ", nombre=" + nombre + "]";
    }
    
}
