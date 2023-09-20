import java.util.ArrayList;
import java.util.Scanner;

public class Juego {
    private ArrayList<Jugador> jugadores;
    private ArrayList<Objeto> saco;
    
    public Juego(){
        this.jugadores = new ArrayList<Jugador>();
        mostrarJugadores();
        initJugadores();
        while(jugadores.size() > 1){
            Start();
            mostrarJugadores();
        }
    }

    public void Start(){
        System.out.println("¡Que comience la partida!");
        for(Jugador p : jugadores){
            jugarTurno(p);
        }
    }

    public void jugarTurno(Jugador jugador){
        jugador.usarObjetoAleatorio();
        if(jugador.getVidas() == 0){
            jugadores.remove(jugador);
        }
    }

    public void initJugadores(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el numero de jugadores: ");
        int nJugadores = sc.nextInt();
        for(int i = 0; i < nJugadores; i++){
            System.out.println("Introduce el nombre del jugador: ");
            String nombre = sc.next();
            jugadores.add(new Jugador(nombre));
        }
    }

    public void mostrarJugadores(){
        for(int i = 0; i < this.jugadores.size(); i++){
            System.out.println(i+1 + ") " + jugadores.get(i).cogerDatos());
        }
    }
}
