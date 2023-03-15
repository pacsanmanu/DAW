package Ej25.Clases;

import java.time.LocalDate;

public class Comentario {
    String usuario;
    String texto;
    LocalDate fecha;

    public Comentario(String usuario, String texto){
        this.usuario = usuario;
        this.texto = texto;
        this.fecha = LocalDate.now();
    }

    @Override
    public String toString() {
        return "[usuario=" + usuario + ", texto=" + texto + ", fecha=" + fecha + "]";
    }
}
