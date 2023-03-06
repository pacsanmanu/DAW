package Ej27.Clases;

import java.time.LocalDate;

public class ContactoPersona extends Contacto implements IContactoPersona{
    LocalDate fechaNacimiento;

    public ContactoPersona(String nombre, String telefono, LocalDate fechaNacimiento){
        super(nombre, telefono);
        this.fechaNacimiento = fechaNacimiento;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    @Override
    public String toString() {
        return "ContactoPersona [" + getNombre() + ", " + getTelefono() + ", " + getFechaNacimiento() + "]";
    }
}
