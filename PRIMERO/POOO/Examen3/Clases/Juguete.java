package Clases;

public class Juguete extends Articulo{
    public Juguete(String nombre, String codigo, double precio){
        super(nombre, codigo, precio);
    }

    public void Usar(){
        System.out.println("Juego con mi " + this.getNombre());
    }
}
