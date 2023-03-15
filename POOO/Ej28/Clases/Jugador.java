import java.util.ArrayList;
import java.util.Arrays;

public class Jugador {
    private String nombre;
    private int vidas;
    private ArrayList<Objeto> objetos;

    public Jugador(String nombre){
        this.nombre = nombre;
        this.vidas = 1;
        this.objetos = new ArrayList<Objeto>(Arrays.asList(
            new Pocion(),
            new Veneno(),
            new Agua()
        ));
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public String cogerDatos(){
        return this.nombre + ", " + this.vidas + ", " + this.objetos.size();
    }

    public void usarObjetoAleatorio(){
        int randomIndex = (int)(Math.random() * this.objetos.size());
        Objeto objeto = objetos.get(randomIndex);
        objeto.Usar(this);
    }
}
