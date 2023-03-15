package Clases;

public abstract class Comida extends Articulo implements Alimento{
    private boolean caducado;

    public Comida(String nombre, String codigo, double precio){
        super(nombre, codigo, precio);
        this.caducado = false;
    }

    public boolean isCaducado(){
        return this.caducado;
    }

    public void setCaducado(boolean caducado){
        this.caducado = caducado;
    }

    public boolean caducar(){
        int random = (int)(Math.random() * 10);
        if(random < 5){
            this.caducado = true;
        }
        return this.caducado;
    }

    public void Usar(){
        System.out.println("Me como mi " + this.getNombre());
    }

    @Override
    public String toString(){
        String miArticulo =  "[Nombre: " + this.getNombre() + ", Codigo: " + this.getCodigo() + ", Precio:  " + this.getPrecio() + "]";
        if(this.caducado){
            miArticulo += " (caducado)";
        }

        return miArticulo;
    }
}
