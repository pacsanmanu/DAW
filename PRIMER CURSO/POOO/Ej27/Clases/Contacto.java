package Ej27.Clases;

import javax.swing.Icon;

public class Contacto implements IContacto{
    private String nombre;
    private String telefono;

    public Contacto(String nombre, String telefono){
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return "Contacto [" + getNombre() + ", " + getTelefono() + "]";
    }
    
}
