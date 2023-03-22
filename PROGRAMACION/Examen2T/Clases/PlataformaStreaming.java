package Clases;

    // Manuel Pacheco Sánchez, 1º DAW

import java.util.ArrayList;

public class PlataformaStreaming implements IPlataformaStreaming{
    private int id;
    private String nombre;
    private double precioSuscripcion;
    private ArrayList<Contenido> contenidos;
    private boolean contieneAnuncios;

    public PlataformaStreaming(int id, String nombre, double precioSuscripcion){
        this.id = id;
        this.nombre = nombre;
        this.precioSuscripcion = precioSuscripcion;
        this.contenidos = new ArrayList<Contenido>();
        this.contieneAnuncios = false;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioSuscripcion() {
        return this.precioSuscripcion;
    }

    public void setPrecioSuscripcion(double precioSuscripcion) {
        this.precioSuscripcion = precioSuscripcion;
    }

    public ArrayList<Contenido> getContenidos() {
        return this.contenidos;
    }

    public void setContenidos(ArrayList<Contenido> contenidos) {
        this.contenidos = contenidos;
    }

    public boolean isContieneAnuncios() {
        return this.contieneAnuncios;
    }

    public void setContieneAnuncios(boolean contieneAnuncios) {
        this.contieneAnuncios = contieneAnuncios;
    }

    public boolean añadirContenido(Contenido c){
        // Devolvemos el resultado de añadir el contenido. Si ya lo tenía, devolverá false y no se añadirá
        // Y si no lo tenía, se añadirá y devolverá true
        return this.contenidos.add(c);
    }

    public boolean eliminarContenido(Contenido c){
        // Devolvemos el resultado de eliminar el contenido. Si no se encuentra en la lista de contenidos devolverá false
        // Y si existe, se eliminará y devolverá true
        return this.contenidos.remove(c);
    }

    public ArrayList<Contenido> obtenerTopDiez(){
        ArrayList<Contenido> bibliotecaContenido = this.getContenidos();
        ArrayList<Contenido> topDiez = new ArrayList<Contenido>();
        Contenido aux;

        // He creado una lista donde tendré todos los contenidos, otra para ir creando el top 10, que será la que devolveré
        // Y una variable auxiliar de tipo contenido donde almacenaré el que haya introducido en la lista top 10 y lo eliminaré de la biblioteca de contenidos

        if(bibliotecaContenido.size() < 10){
            topDiez = bibliotecaContenido;
        }else{
            for(int i = 0; i < 10; i++){
                // Inicio aux con el primer contenido de todos
                aux = bibliotecaContenido.get(0);
                for(int j = 1; j < bibliotecaContenido.size(); j++){
                    // Si el numero de horas reproducidas de aux es menor al siguiente contenido, lo reemplazamos en aux
                    if(aux.getNumeroHorasReproducidas() < bibliotecaContenido.get(j).getNumeroHorasReproducidas()){
                        aux = bibliotecaContenido.get(j);
                    }
                }
                // Una vez salimos del bucle, tenemos en aux el contenido con mas horas de reproduccion. Lo añadimos a la lista de top 10 contenidos
                // Y lo eliminamos de la biblioteca para que en la siguiente iteración aux almacene el segundo contenido con mas horas de visualización, y así 10 veces.
                topDiez.add(aux);
                bibliotecaContenido.remove(aux);
            }
        }
        return topDiez;
    }

    public int obtenerCalidadImagen(){
        // Dependiendo del precio de la suscripción, tendremos una calidad de imagen inferior o superior.
        if(this.getPrecioSuscripcion() > 0 && this.getPrecioSuscripcion() < 4){
            return 1080;
        }else if(this.getPrecioSuscripcion() > 10){
            return 4096;
        }else{
            return 720;
        }
    }

    public int obtenerNumeroMaximoPantallas(){
        // Dependiendo del precio de la suscripción, dispondremos de un numero de pantallas inferior o superior.
        if(this.getPrecioSuscripcion() > 0 && this.getPrecioSuscripcion() < 4){
            return 2;
        }else if(this.getPrecioSuscripcion() > 10){
            return 100;  // No puedo devolver infinitas pantallas, por eso devuelvo 100 
        }else{
            return 1;
        }
    }

    public String reproducirAnunciosAleatoriamente(){
        // He generado varios anuncios, aleatoriamente se devolverá uno de ellos.
        ArrayList<String> anuncios = new ArrayList<String>();
        anuncios.add("Lorem fistrum occaecat incididunt ese pedazo de. Amatomaa ese pedazo de está la cosa muy malar ad eiusmod a peich eiusmod papaar papaar hasta luego Lucas pecador. No puedor magna sed la caidita al ataquerl qui te voy a borrar el cerito va usté muy cargadoo incididunt. Reprehenderit laboris irure tempor qui pecador llevame al sircoo torpedo. Jarl a gramenawer la caidita officia elit. Elit apetecan sexuarl quis. Se calle ustée por la gloria de mi madre diodenoo te va a hasé pupitaa laboris. Al ataquerl reprehenderit sit amet officia condemor diodeno.");
        anuncios.add("Lorem fistrum te voy a borrar el cerito jarl por la gloria de mi madre. A wan por la gloria de mi madre condemor papaar papaar jarl me cago en tus muelas ahorarr condemor papaar papaar jarl hasta luego Lucas. Va usté muy cargadoo mamaar te voy a borrar el cerito condemor pecador quietooor hasta luego Lucas amatomaa. La caidita torpedo va usté muy cargadoo sexuarl. Diodenoo ese que llega ahorarr la caidita a wan diodenoo. A peich ese que llega caballo blanco caballo negroorl tiene musho peligro ahorarr ese pedazo de llevame al sircoo no te digo trigo por no llamarte Rodrigor. Ese hombree amatomaa a peich me cago en tus muelas papaar papaar pecador fistro.");
        anuncios.add("Lorem fistrum la caidita qui no te digo trigo por no llamarte Rodrigor ese hombree reprehenderit ullamco pecador pupita. Veniam voluptate apetecan te voy a borrar el cerito aute hasta luego Lucas aute sed a wan. Tiene musho peligro ad reprehenderit torpedo quis enim. Cillum me cago en tus muelas duis eiusmod la caidita llevame al sircoo. Fistro ut ese que llega está la cosa muy malar tiene musho peligro et sed quietooor. Al ataquerl qué dise usteer consectetur está la cosa muy malar ese pedazo de hasta luego Lucas.");
        int random = (int)(Math.random() * anuncios.size());
        return anuncios.get(random);
    }

    public String listarContenidos(){
        // Creamos un string donde cada línea va a ser uno de los contenidos de la plataforma
        String lista = "";
        for(Contenido c : this.contenidos){
            lista += c.toString() + "\n";
        }
        return lista;
    }

    @Override
    public String toString() {
        return "PlataformaStreaming [id=" + id + ", nombre=" + nombre + ", precioSuscripcion=" + precioSuscripcion
                + ", contieneAnuncios=" + contieneAnuncios + "]";
    }

}
