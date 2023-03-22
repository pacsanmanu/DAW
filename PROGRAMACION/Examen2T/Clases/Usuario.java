package Clases;
import java.time.LocalDate;
import java.util.ArrayList;

    // Manuel Pacheco Sánchez, 1º DAW

public class Usuario extends Persona{
    private ArrayList<PlataformaStreaming> plataformasStreaming;
    private double saldo;
    private ArrayList<Contenido> contenidosFavoritos;

    public Usuario(int id, String nombre, LocalDate fechaNacimiento){
        super(id, nombre, fechaNacimiento);
        plataformasStreaming = new ArrayList<PlataformaStreaming>();
        saldo = 0;
        contenidosFavoritos = new ArrayList<Contenido>();
    }

    public ArrayList<PlataformaStreaming> getPlataformasStreaming() {
        return this.plataformasStreaming;
    }

    public void setPlataformasStreaming(ArrayList<PlataformaStreaming> plataformasStreaming) {
        this.plataformasStreaming = plataformasStreaming;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ArrayList<Contenido> getContenidosFavoritos() {
        return this.contenidosFavoritos;
    }

    public void setContenidosFavoritos(ArrayList<Contenido> contenidosFavoritos) {
        this.contenidosFavoritos = contenidosFavoritos;
    }

    public void darAltaPlataforma(PlataformaStreaming plataforma){
        // Primero comprobamos que el saldo del usuario es mayor o igual al precio de la suscripción a la plataforma
        if(this.getSaldo() >= plataforma.getPrecioSuscripcion()){
            for(PlataformaStreaming p : this.getPlataformasStreaming()){
                if(p.getId() == plataforma.getId()){
                    this.plataformasStreaming.remove(p);
                    // Primero eliminamos la plataforma en caso de que ya tenga una suscripción
                }
            }
        }
        // Una vez nos aseguramos de que no está suscrito a la plataforma, se la añadimos
        this.plataformasStreaming.add(plataforma);
    }

    public void darBajaPlataforma(PlataformaStreaming plataforma){
        // Si el usuario contiene la plataforma, la eliminamos. Si no, no hacemos nada.
        if(this.plataformasStreaming.contains(plataforma)){
            this.plataformasStreaming.remove(plataforma);
        }
    }

    public String listarPlataformas(){
        // Creamos un string donde cada línea va a ser una de las plataformas que contiene
        String lista = "";
        for(PlataformaStreaming p : this.plataformasStreaming){
            lista += p.toString() + "\n";
        }
        return lista;
    }

    public void compartirContenido(Usuario usuario, Contenido contenido){
        // Si el contenido está en nuestros favoritos, continuamos
        if(this.contenidosFavoritos.contains(contenido)){
            if(!usuario.contenidosFavoritos.contains(contenido)){
                // Si el contenido no está dentro de los favoritos del usuario al que le compartimos, lo añadimos
                usuario.contenidosFavoritos.add(contenido);
            }
        }
    }

    public boolean añadirContenidoFavorito(Contenido contenido){
        // Si el contenido no se encuentra en nuestros favoritos, lo añadimos.
        if(!this.contenidosFavoritos.contains(contenido)){
            return this.contenidosFavoritos.add(contenido);
        }else{
            // Devuelvo false en el else, ya que si entra en el if, siempre devolverá true.
            return false;
        }
    }

    public boolean eliminarContenidoFavorito(Contenido contenido){
        // Si el contenido se encuentra en nuestros favoritos, lo eliminamos
        if(this.contenidosFavoritos.contains(contenido)){
            return this.contenidosFavoritos.remove(contenido);
        }else{
            // Devuelvo false en el else, ya que si entra en el if, siempre devolverá true.
            return false;
        }
    }

    public String listarContenidoFavoritos(){
        // Creamos un string donde cada línea va a ser uno de los contenidos favoritos del usuario
        String lista = "";
        for(Contenido c : this.contenidosFavoritos){
            lista += c.toString() + "\n";
        }
        return lista;
    }

    @Override
    public String toString() {
        return "Usuario [id=" + this.getId() + ", nombre=" + this.getNombre() + ", fechaNacimiento=" + this.getFechaNacimiento()
        + ", plataformasStreaming: " + this.getPlataformasStreaming() + ", saldo: " + this.getSaldo() + ", contenidosFavoritos:" + this.getContenidosFavoritos() + "]";
    }

}
