package Clases;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Tienda {
    private String nombre;
    private ArrayList<Libro> libros;
    private ArrayList<Cliente> clientes;

    public Tienda(String nombre){
        this.nombre = nombre;
        this.libros = new ArrayList<Libro>();
        this.clientes = new ArrayList<Cliente>();
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

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void verClientes(){
        System.out.println("Registro de clientes: ");
        System.out.println();
        for(int i = 0; i < clientes.size(); i++){
            System.out.println(i+1 + ") " + clientes.get(i));
        }
    }

    public void listar(){
        System.out.println("Registro de libros: ");
        System.out.println();
        for(int i = 0; i < libros.size(); i++){
            System.out.println(i+1 + ") " + this.libros.get(i));
        }
    }

    public void listar(int opcion){
        Scanner sc = new Scanner(System.in);
        int contador = 1;
        if(opcion == 1){
            System.out.println("Introduce el título a buscar: ");
            String titulo = sc.nextLine();
            for(int i = 0; i < libros.size(); i++){
                if(libros.get(i).getNombre().toUpperCase().contains(titulo.toUpperCase())){
                    System.out.println(contador + ") " + libros.get(i));
                }
            }
        }else if(opcion == 2){
            System.out.println("Introduce el autor a buscar: ");
            String autor = sc.nextLine();
            for(int i = 0; i < libros.size(); i++){
                if(libros.get(i).getAutor().toUpperCase().contains(autor.toUpperCase())){
                    System.out.println(contador + ") " + libros.get(i));
                }
            }
        }else if(opcion == 3){
            System.out.println("Introduce la categoría a buscar: ");
            String categoria = sc.nextLine();
            for(int i = 0; i < libros.size(); i++){
                if(libros.get(i).getCategoria().toUpperCase().contains(categoria.toUpperCase())){
                    System.out.println(contador + ") " + libros.get(i));
                }
            }
        }
    }

    public void addLibro(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Introduzca el autor: ");
        String autor = sc.nextLine();
        System.out.println("Introduzca la categoría: ");
        String categoria = sc.nextLine();
        System.out.println("Introduzca el precio: ");
        double precio = sc.nextDouble();
        System.out.println("Introduzca la cantidad de libros: ");
        int cantidad = sc.nextInt();
        Libro libro = new Libro(nombre, autor, categoria, precio, cantidad);
        Boolean existe = false;
        for(Libro l : libros){
            if(libro.getNombre().equals(l.getNombre())){
                System.out.println("El libro ya existe. Se añadirá +1 a su cantidad.");
                l.setCantidad(l.getCantidad() + 1);
                existe = true;
            }
        }
        if(!existe){
            System.out.println("El libro se ha añadido correctamente.");
            libros.add(libro);
        }

    }

    public void addCliente(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el nombre: ");
        String nombre = sc.next();
        System.out.println("Introduzca el dinero del cliente: ");
        double dinero = sc.nextDouble();
        Cliente cliente = new Cliente(nombre, dinero);
        boolean existe = false;
        for(Cliente c : clientes){
            if(cliente.getNombre().equals(c.getNombre())){
                System.out.println("El cliente ya existe.");
                existe = true;
            }
        }
        if(!existe){
            clientes.add(cliente);
            System.out.println("El cliente se ha añadido correctamente.");
        }
    }

    public void venderLibro(Cliente cliente, Libro libro){
        if(libro.comprar()){
            if(cliente.pagarLibro(libro.getPrecio())){
                cliente.addLibro(libro);
            }
        }
        int indice = libros.indexOf(libro);
        if(libros.get(indice).getCantidad() > 1){
            System.out.println("¡Comprado! Se ha restado 1 a la cantidad de libros disponibles.");
            libros.get(indice).setCantidad(libros.get(indice).getCantidad() - 1);
            System.out.println("Quedan " + libros.get(indice).getCantidad() + " existencias del libro.");
        }else{
            System.out.println("¡Comprado! Se ha agotado el libro. Va a eliminarse de la lista de libros disponibles.");
            libros.remove(libro);
        }
    }
}
