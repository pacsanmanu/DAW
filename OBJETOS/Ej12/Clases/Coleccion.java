package Clases;
import Clases.*;
import java.util.ArrayList;
import java.util.Collection;

public class Coleccion {
    private String nombre;
    private ArrayList<Figura> listaFiguras;

    public Coleccion(String nombre){
        this.nombre = nombre;
        this.listaFiguras = new ArrayList<Figura>();
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void añadirFigura(Figura figura){
        this.listaFiguras.add(figura);
    }

    public void subirPrecio(double cantidad, String codigo){
        for(int i = 0; i < this.listaFiguras.size(); i++){
            if(listaFiguras.get(i).getCodigo().equals(codigo)){
                listaFiguras.get(i).subirPrecio(cantidad);
            }
        }
    }

    public Figura masValioso(){
        Figura aux = new Figura("nombre", 0, null, null);
        for(int i = 0; i < listaFiguras.size(); i++){
            if(listaFiguras.get(i).getPrecio() > aux.getPrecio()){
                aux = listaFiguras.get(i);
            }
        }
        return aux;
    }

    public double getValorColeccion(){
        double aux = 0;
        for(int i = 0; i < listaFiguras.size(); i++){
            aux += listaFiguras.get(i).getPrecio();
        }
        return aux;
    }

    public double getVolumenColeccion(){
        double aux = 0;
        for(int i = 0; i < listaFiguras.size(); i++){
            aux += listaFiguras.get(i).getDimension().getVolumen();
        }
        aux += 200;
        return aux;
    }

    public String conCapa(){
        String aux = "";
        for(int i = 0; i < listaFiguras.size(); i++){
            if(listaFiguras.get(i).getSuperheroe().hasCapa()){
                aux += listaFiguras.get(i);
                aux += "\n";
            }
        }
        return aux;
    }

    @Override
    public String toString(){
        String aux = "";
        for(int i = 0; i < listaFiguras.size(); i++){
            aux += "Figura " + i + ": ";
            aux += listaFiguras.get(i);
            aux += "\n";
        }
        return aux;
    }
}
