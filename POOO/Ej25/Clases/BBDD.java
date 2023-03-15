package Ej25.Clases;

import java.util.ArrayList;
import java.util.List;

public class BBDD {
    List<Usuario> usuarios = new ArrayList<Usuario>();
    List<Comentario> comentarios = new ArrayList<Comentario>();

    public BBDD(List<Usuario> usuarios, List<Comentario> comentarios){
        this.usuarios = usuarios;
        this.comentarios = comentarios;
    }
}
