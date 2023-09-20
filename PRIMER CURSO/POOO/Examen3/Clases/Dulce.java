package Clases;

public class Dulce extends Comida{
    private double grasas;

    public Dulce(String nombre, String codigo, double precio, double grasas){
        super(nombre, codigo, precio);
        this.grasas = grasas;
    }

    public double getGrasas() {
        return grasas;
    }

    public void setGrasas(double grasas) {
        this.grasas = grasas;
    }

    public void Usar(){
        System.out.println("Me tomo el " + this.getNombre() + " y engordo " + this.getGrasas() + " gramos.");
    }

    @Override
    public String toString(){
        String miArticulo =  "[Nombre: " + this.getNombre() + ", Codigo: " + this.getCodigo() + ", Precio:  " + this.getPrecio() + "] Esto engorda " + this.getGrasas() + " gramos.";
        if(this.isCaducado()){
            miArticulo += " (caducado)";
        }

        return miArticulo;
    }

}
