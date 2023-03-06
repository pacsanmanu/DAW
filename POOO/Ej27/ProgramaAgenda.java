package Ej27;
import Ej27.Clases.*;

public class ProgramaAgenda{
    public static void main(String[] args) {
        Contacto c1 = new Contacto("Manuel", "696669669");
        Contacto c2 = new Contacto("Pedro", "666666666");
        Contacto c3 = new Contacto("Paco", "999999999");
        Contacto c4 = new Contacto("Pepe", "777777777");

        Agenda paginasAmarillas = new Agenda();
        paginasAmarillas.añadirContacto(c1);
        paginasAmarillas.añadirContacto(c2);
        paginasAmarillas.añadirContacto(c3);
        paginasAmarillas.añadirContacto(c4);

        System.out.println(paginasAmarillas.buscaContacto("Paco"));
        paginasAmarillas.eliminarContacto("Paco");

        paginasAmarillas.listarContactos();
    }
}