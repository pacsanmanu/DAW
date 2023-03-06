package Ej25.Clases;

public class Panel {
    BBDD baseDeDatos;

    public Panel(BBDD basededatos){
        this.baseDeDatos = basededatos;
    }

    public String mostrarAcciones(Usuario usuario){
        String acciones = "Añadir Comentario";

        if(usuario instanceof Manager){
            acciones += ", Añadir Usuario";
        }else if(usuario instanceof Admin){
            acciones += ", Añadir Usuario, Borrar Usuario";
        }

        return acciones;
    }

    public String mostrarUsuarios(BBDD basededatos){
        String usuarios = "";
        for(Usuario u : basededatos.usuarios){
            usuarios += u.toString();
            usuarios += " - ";
        }
        return usuarios;
    }

    public String login(String nombreusuario, String contraseña){
        Usuario usuario = new Usuario(nombreusuario, contraseña);
        if(this.baseDeDatos.usuarios.contains(usuario)){
            return "Bienvenido " + usuario.getNombre();
        }else{
            return "El usuario que ha introducido no existe. Compruebe la información otorgada.";
        }
    }
}
