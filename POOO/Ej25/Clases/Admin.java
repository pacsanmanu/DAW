package Ej25.Clases;

public class Admin extends Manager{
    public Admin(String nombre, String contraseña){
        super(nombre, contraseña);
    }

    public String borrarUsuario(Usuario usuario, Panel panel){
        if(panel.baseDeDatos.usuarios.contains(usuario)){
            panel.baseDeDatos.usuarios.remove(usuario);
            return "Se ha borrado el " + usuario.toString();
        }else{
            return "El usuario no se encuentra en la base de datos.";
        }
    }
}
