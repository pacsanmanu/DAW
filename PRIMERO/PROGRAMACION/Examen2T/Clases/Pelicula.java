package Clases;

    // Manuel Pacheco Sánchez, 1º DAW

public class Pelicula extends Contenido{
    private String tipoPelicula;

    public Pelicula(int id, String nombre, double duracion, int edadMinima, double numeroHorasReproducidas, String tipoPelicula){
        super(id, nombre, duracion, edadMinima, numeroHorasReproducidas);
        this.tipoPelicula = tipoPelicula;
    }

    public String getTipoPelicula() {
        return tipoPelicula;
    }

    public void setTipoPelicula(String tipoPelicula) {
        this.tipoPelicula = tipoPelicula;
    }

    @Override
    public String toString() {
        return "Pelicula [id=" + this.getId() + ", nombre=" + this.getNombre() + ", duracion=" + this.getDuracion() + ", edadMinima=" + this.getEdadMinima()
                + ", numeroHorasReproducidas=" + this.getNumeroHorasReproducidas() +", tipoPelicula: " + this.getTipoPelicula() + "]\n\n";
    }

    
}
