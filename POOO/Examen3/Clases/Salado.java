package Clases;

public class Salado extends Comida{
    private double nutrientes;

    public Salado(String nombre, String codigo, double precio, double nutrientes){
        super(nombre, codigo, precio);
        this.nutrientes = nutrientes;
    }

    public double getNutrientes() {
        return nutrientes;
    }

    public void setNutrientes(double nutrientes) {
        this.nutrientes = nutrientes;
    }

    public void Usar(){
        System.out.println("Me tomo el " + this.getNombre() + " y me nutro " + this.getNutrientes() + " gramos.");
    }

    @Override
    public String toString(){
        String miArticulo =  "[Nombre: " + this.getNombre() + ", Codigo: " + this.getCodigo() + ", Precio:  " + this.getPrecio() + "] Esto nutre " + this.getNutrientes() + " gramos.";
        if(this.isCaducado()){
            miArticulo += " (caducado)";
        }

        return miArticulo;
    }
}
