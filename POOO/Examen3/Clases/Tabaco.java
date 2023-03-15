package Clases;

public class Tabaco extends Articulo{
    private int unidades;

    public Tabaco(String nombre, String codigo, double precio){
        super(nombre, codigo, precio);
        this.unidades = 10;
    }
    
    public int getUnidades() {
        return unidades;
    }
    
    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public void Usar(){
        this.setUnidades(this.getUnidades() - 1);
        if(this.unidades > 0){
            System.out.println("Me acabo de fumar un cigarro. Quedan " + this.getUnidades());
        }else{
            System.out.println("No quedan cigarros :)");
        }
    }
    
}