package Clases;
import java.time.LocalDate;

    // Manuel Pacheco Sánchez, 1º DAW

public class Profesor extends Persona{
    private LocalDate horario;

    public Profesor(int id, String nombre, LocalDate fechaNacimiento, LocalDate horario){
        super(id, nombre, fechaNacimiento);
        this.horario = horario;
    }

    public LocalDate getHorario() {
        return this.horario;
    }

    public void setHorario(LocalDate horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "Profesor [id=" + this.getId() + ", nombre=" + this.getNombre() + ", fechaNacimiento=" + this.getFechaNacimiento() + ", horario=" + this.getHorario() + "]";
    }
}
