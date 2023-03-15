package Ej25.Clases;

public class Usuario {
    String nombre;
    String contraseña;

    public Usuario(String nombre, String contraseña){
        this.nombre = nombre;
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getContraseña() {
        return this.contraseña;
    }

    public String addComentario(Panel panel, String texto){
        Comentario comentario = new Comentario(this.nombre, texto);
        panel.baseDeDatos.comentarios.add(comentario);
        return "Se ha añadido el comentario: " + comentario.toString();
    }

    @Override
    public String toString() {
        return "[nombre=" + nombre + ", contraseña=" + contraseña + "]";
    }

}

