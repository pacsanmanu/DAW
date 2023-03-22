package Clases;

    // Manuel Pacheco Sánchez, 1º DAW
    
public class Serie extends Contenido{
    private String tipoSerie;
    private int numeroCapitulos;
    private int numeroTemporadas;

    public Serie(int id, String nombre, double duracion, int edadMinima, double numeroHorasReproducidas, String tipoSerie, int numeroCapitulos, int numeroTemporadas){
        super(id, nombre, duracion, edadMinima, numeroHorasReproducidas);
        this.tipoSerie = tipoSerie;
        this.numeroCapitulos = numeroCapitulos;
        this.numeroTemporadas = numeroTemporadas;
    }

    public String getTipoSerie() {
        return this.tipoSerie;
    }

    public void setTipoSerie(String tipoSerie) {
        this.tipoSerie = tipoSerie;
    }

    public int getNumeroCapitulos() {
        return this.numeroCapitulos;
    }

    public void setNumeroCapitulos(int numeroCapitulos) {
        this.numeroCapitulos = numeroCapitulos;
    }

    public int getNumeroTemporadas() {
        return this.numeroTemporadas;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    @Override
    public String toString() {
        return "Serie [id=" + this.getId() + ", nombre=" + this.getNombre() + ", duracion=" + this.getDuracion() + ", edadMinima=" + this.getEdadMinima()
                + ", numeroHorasReproducidas=" + this.getNumeroHorasReproducidas() +", tipoSerie: " + this.getTipoSerie() + ", numeroCapitulos: " + this.getNumeroCapitulos()
                + ", numeroTemporadas: " + this.getNumeroTemporadas() + "]\n\n";
    }
    
}
