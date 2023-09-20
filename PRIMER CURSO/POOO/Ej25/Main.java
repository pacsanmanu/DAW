package Ej25;
import java.util.ArrayList;
import java.util.List;

import Ej25.Clases.*;

public class Main {
    public static void main(String[] args) {
        List<Usuario> usuarios = new ArrayList<Usuario>();
        List<Comentario> comentarios = new ArrayList<Comentario>();
        BBDD baseDeDatos = new BBDD(usuarios, comentarios);

        Usuario Manuel = new Admin("Manuel", "lamarash");
        usuarios.add(Manuel);

        Panel myApp = new Panel(baseDeDatos);
        System.out.println("Usuarios: " + myApp.mostrarUsuarios(baseDeDatos));
       
    }
}
