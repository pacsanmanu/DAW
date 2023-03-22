package Clases;

    // Manuel Pacheco Sánchez, 1º DAW

import java.time.LocalDate;

public class Persona {
    private int id;
    private String nombre;
    private LocalDate fechaNacimiento;

    public Persona(int id, String nombre, LocalDate fechaNacimiento){
        this.id = id;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
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

    public LocalDate getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Persona [id=" + this.getId() + ", nombre=" + this.getNombre() + ", fechaNacimiento=" + this.getFechaNacimiento() + "]";
    }
}
