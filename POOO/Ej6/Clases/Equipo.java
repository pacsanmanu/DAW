package Ej6.Clases;

public class Equipo {
    public String Nombre;
    public String Temporada;
    public int PartidosJugados;
    public int PartidosGanados;
    public int PartidosPerdidos;

    public Equipo(String Nombre, String Temporada){
        this.Nombre = Nombre;
        this.Temporada = Temporada;
    }

    public String getNombre(){
        return this.Nombre;
    }

    public int getPartidosJugados(){
        return this.PartidosJugados;
    }

    public int getPartidosGanados(){
        return this.PartidosGanados;
    }

    public int getPartidosPerdidos(){
        return this.PartidosPerdidos;
    }

    public String getTemporada(){
        return this.Temporada;
    }

    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }

    public void setTemporada(String Temporada){
        this.Temporada = Temporada;
    }

    public void setPartidosJugados(int Partidos){
        this.PartidosJugados = Partidos;
    }
    
    public void setPartidosPerdidos(int Partidos){
        this.PartidosPerdidos = Partidos;
    }
    
    public void setPartidosGanados(int Partidos){
        this.PartidosGanados = Partidos;
    }
    
    public String toString(){
        return  this.getNombre() + ", " + this.getTemporada() + ", " + this.getPartidosJugados() + ", " + this.getPartidosGanados() + ", " + this.getPartidosPerdidos();
    }

}