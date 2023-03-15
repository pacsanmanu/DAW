package Clases;

public class Libro {
    private String nombre;
    private String autor;
    private String categoria;
    private double precio;
    private int cantidad;

    public Libro(String nombre, String autor, String categoria, double precio, int cantidad){
        this.nombre = nombre;
        this.autor = autor;
        this.categoria = categoria;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "[nombre=" + nombre + ", autor=" + autor + ", categoria=" + categoria + ", precio=" + precio
                + ", cantidad=" + cantidad + "]";
    }

    public boolean comprar(){
        if(this.cantidad > 0){
            return true;
        }else{
            return false;
        }
    }

    public boolean comprar(int cantidad){
        if(this.cantidad - cantidad >= 0){
            return true;
        }else{
            return false;
        }
    }
}
