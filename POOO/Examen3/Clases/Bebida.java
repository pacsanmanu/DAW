package Clases;

public class Bebida extends Articulo implements Alimento{
    private boolean caducado;
    private double nutrientes;
    private double grasas;

    public Bebida(String nombre, String codigo, double precio, double nutrientes, double grasas){
        super(nombre, codigo, precio);
        this.caducado = false;
        this.nutrientes = nutrientes;
        this.grasas = grasas;
    }

    public double getNutrientes() {
        return nutrientes;
    }

    public void setNutrientes(double nutrientes) {
        this.nutrientes = nutrientes;
    }

    public double getGrasas() {
        return grasas;
    }

    public void setGrasas(double grasas) {
        this.grasas = grasas;
    }

    public boolean isCaducado(){
        return this.caducado;
    }

    public void setCaducado(boolean caducado){
        this.caducado = caducado;
    }

    public boolean caducar(){
        double random = Math.random() * 10;
        if(random < 2.5){
            this.caducado = true;
        }
        return this.caducado;
    }

    public void Usar(){
        System.out.println("Me tomo el " + this.getNombre() + ", me nutro " + this.getNutrientes() + " gramos y engordo " + this.getGrasas());
    }

    @Override
    public String toString(){
        String miArticulo =  "[Nombre: " + this.getNombre() + ", Codigo: " + this.getCodigo() + ", Precio: " + this.getPrecio() + ", Nutrientes: " + this.getNutrientes() + ", Grasas: " + this.getGrasas() + "]";
        if(this.caducado){
            miArticulo += " (caducado)";
        }
        return miArticulo;
    }
}
