package Clases;

    // Manuel Pacheco Sánchez, 1º DAW

public class CanalProfesor extends Contenido{
    Profesor profesor;
    boolean enDirecto;

    public CanalProfesor(int id, String nombre, double duracion, int edadMinima, double numeroHorasReproducidas, Profesor profesor){
        super(id, nombre, duracion, edadMinima, numeroHorasReproducidas);
        this.profesor = profesor;
        this.enDirecto = false;
    }

    public Profesor getProfesor() {
        return this.profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public boolean isEnDirecto() {
        return this.enDirecto;
    }

    public void setEnDirecto(boolean enDirecto) {
        this.enDirecto = enDirecto;
    }

    @Override
    public String toString() {
        return "CanalProfesor [id=" + this.getId() + ", nombre=" + this.getNombre() + ", duracion=" + this.getDuracion() + ", edadMinima=" + this.getEdadMinima()
                + ", numeroHorasReproducidas=" + this.getNumeroHorasReproducidas() +", Profesor: " + this.getProfesor()
                + ", enDirecto: " + this.isEnDirecto() + "]\n\n";
    }
    
}
