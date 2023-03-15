package Ej27.Clases;

public interface IAgenda {
    public boolean añadirContacto(Contacto c);
    public boolean eliminarContacto(String nombre);
    public boolean existeContacto(String nombre);
    public void listarContactos();
    public int buscaContacto(String nombre);
}
