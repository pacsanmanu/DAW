package Ej27.Clases;

public class ContactoEmpresa extends Contacto implements IContactoEmpresa{
    private String paginaWeb;

    public ContactoEmpresa(String nombre, String telefono, String paginaWeb){
        super(nombre, telefono);
        this.paginaWeb = paginaWeb;
    }
    
    public String getPaginaWeb() {
        return paginaWeb;
    }

    @Override
    public String toString() {
        return "ContactoEmpresa [" + getNombre() + ", " + getTelefono() + ", " + getPaginaWeb() + "]";
    }
}
