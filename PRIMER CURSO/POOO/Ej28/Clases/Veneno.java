public class Veneno extends Objeto{
    public Veneno(){
        super("Veneno");
    }

    public void Usar(Jugador jugador){
        jugador.setVidas(jugador.getVidas() - 1);
    }
}
