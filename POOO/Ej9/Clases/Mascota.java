package Ej9.Clases;

public class Mascota {
    private String nombre;
    private int ataque;
    private int vida;
    private String comida;
    private int nivel;

    public Mascota(String nombre, int ataque, int vida){
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
    }

    public void setAtaque(int ataque){
        this.ataque = ataque;
    }

    public int getAtaque(){
        return this.ataque;
    }

    public void setVida(int vida){
        this.vida = vida;
    }

    public int getVida(){
        return this.vida;
    }
    
    public void setnombre(String nombre){
        this.nombre = nombre;
    }

    public String getnombre(){
        return this.nombre;
    }

    public void atacar(Mascota mascota){
        this.vida = this.vida - mascota.ataque;
        mascota.vida = mascota.vida - this.ataque;
    }

    @Override
    public String toString(){
        return "[" + 
            this.nombre + "," +
            this.ataque + "," +
            this.vida + "]";
    }
}