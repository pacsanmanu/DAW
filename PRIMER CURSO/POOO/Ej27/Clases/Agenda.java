package Ej27.Clases;

import java.util.ArrayList;
import java.util.List;

public class Agenda implements IAgenda{
    private ArrayList<Contacto> Contactos;

    public Agenda(){
        this.Contactos = new ArrayList<Contacto>();
    }

    public boolean añadirContacto(Contacto c){
        boolean añadido = true;

        for(Contacto contact : this.Contactos){
            if(contact.getNombre().equals(c.getNombre())){
                añadido = false;
            }
        }

        if(añadido){
            this.Contactos.add(c);
        }
        return añadido;
    }

    public boolean eliminarContacto(String nombre){
        boolean eliminado = false;

        for(Contacto contact : this.Contactos){
            if(contact.getNombre().equals(nombre)){
                eliminado = true;
                this.Contactos.remove(contact);
            }
        }

        return eliminado;
    }

    public boolean existeContacto(String nombre){
        boolean existe = false;

        for(Contacto contact : this.Contactos){
            if(contact.getNombre().equals(nombre)){
                existe = true;
            }
        }

        return existe;
    }

    public void listarContactos(){
        for(Contacto contact : this.Contactos){
            System.out.println(contact);
        }
    }

    public int buscaContacto(String nombre){
        int posicion = -1;
        for(Contacto contact : this.Contactos){
            if(contact.getNombre().equals(nombre)){
                posicion = this.Contactos.indexOf(contact);
            }
        }
        return posicion;
    }
}
