package Ej25.Clases;

public class Manager extends Usuario{
    
    public Manager(String nombre, String contraseña){
        super(nombre, contraseña);
    }

    public String borrarComentario(Comentario comentario, Panel panel){
        if(panel.baseDeDatos.comentarios.contains(comentario)){
            panel.baseDeDatos.comentarios.remove(comentario);
            return "Se ha borrado el comentario: " + comentario.toString();
        }else{
            return "El comentario no se encuentra en la base de datos.";
        }
    }

    public String addUsuario(Usuario usuario, Panel panel){
        if(panel.baseDeDatos.usuarios.contains(usuario)){
            return "La base de datos ya contiene al usuario " + usuario.toString();
        }else{
            panel.baseDeDatos.usuarios.add(usuario);
            return "Se ha añadido el " + usuario.toString();
        }
    }
}
