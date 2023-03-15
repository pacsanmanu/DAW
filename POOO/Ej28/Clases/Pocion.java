public class Pocion extends Objeto{
    public Pocion(){
        super("Pocion");
    }

    public void Usar(Jugador jugador){
        jugador.setVidas(jugador.getVidas() + 1);
    }
}
