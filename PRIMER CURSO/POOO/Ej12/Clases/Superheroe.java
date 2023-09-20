package Clases;

public class Superheroe {
    private String nombre;
    private String descripcion;
    private boolean capa;

    public Superheroe(String nombre){
        this.nombre = nombre;
        this.descripcion = "";
        this.capa = false;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getDescripcion(){
        return this.descripcion;
    }

    public void setDescripcion(String desc){
        this.descripcion = desc;
    }

    public boolean hasCapa(){
        return this.capa;
    }

    public void setCapa(boolean capa){
        this.capa = capa;
    }

    @Override
    public String toString(){
        String aux = "";
        aux += "[" + this.nombre + ", " + this.descripcion + ", ";
        if(this.capa){
            aux += "con capa]";
        }else{
            aux+= "sin capa]";
        }
        return aux;
    }
}
