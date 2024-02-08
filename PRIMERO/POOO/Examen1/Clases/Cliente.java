package Clases;

import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private ArrayList<Libro> libros;
    private double dinero;

    public Cliente(String nombre, double dinero){
        this.nombre = nombre;
        this.libros = new ArrayList<Libro>();
        this.dinero = dinero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    @Override
    public String toString() {
        return "[nombre=" + nombre + ", libros=" + libros + ", dinero=" + dinero + "]";
    }

    public boolean pagarLibro(double precio){
        if(this.dinero >= precio){
            this.dinero -= precio;
            return true;
        }else{
            System.out.println("No puedes pagar este libro.");
            return false;
        }
    }

    public void addLibro(Libro libro){
        this.libros.add(libro);
        System.out.println("Se ha añadido el libro a su lista.");
    }

    public int getNumeroLibros(){
        return this.libros.size();
    }
}
