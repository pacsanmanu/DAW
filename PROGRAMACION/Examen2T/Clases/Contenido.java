package Clases;

    // Manuel Pacheco Sánchez, 1º DAW

    public abstract class Contenido {
    private int id;
    private String nombre;
    private double duracion;
    private int edadMinima;
    private double numeroHorasReproducidas;

    public Contenido(int id, String nombre, double duracion, int edadMinima, double numeroHorasReproducidas){
        this.id = id;
        this.nombre = nombre;
        this.duracion = duracion;
        this.edadMinima = edadMinima;
        this.numeroHorasReproducidas = numeroHorasReproducidas;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDuracion() {
        return this.duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public int getEdadMinima() {
        return this.edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    public double getNumeroHorasReproducidas() {
        return this.numeroHorasReproducidas;
    }

    public void setNumeroHorasReproducidas(double numeroHorasReproducidas) {
        this.numeroHorasReproducidas = numeroHorasReproducidas;
    }

    @Override
    public String toString() {
        return "Contenido [id=" + this.getId() + ", nombre=" + this.getNombre() + ", duracion=" + this.getDuracion() + ", edadMinima=" + this.getEdadMinima()
                + ", numeroHorasReproducidas=" + this.getNumeroHorasReproducidas() + "]\n\n";
    }

    
}
