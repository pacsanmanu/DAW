package Ej9;
import Ej9.Clases.*;
import java.util.ArrayList;
import Ej9.Clases.Mascota;

public class Main {
    public static void main(String[] args) {
        ArrayList<Mascota> mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota("Perro", 4, 7));
        mascotas.add(new Mascota("Gato", 3, 8));

        ArrayList<Mascota> mascotas2 = new ArrayList<Mascota>();
        mascotas.add(new Mascota("Raton", 2, 6));
        mascotas.add(new Mascota("Pitbull Demonio", 7, 5));

        Equipo equipo1 = new Equipo("Equipo 1", mascotas);
        Equipo equipo2 = new Equipo("Equipo 2", mascotas2);

        StartRound(equipo1, equipo2);
    }

    public static Equipo StartRound(Equipo equipo1, Equipo equipo2){
        while(equipo1.mascotasSize() > 0 && equipo2.mascotasSize() > 0){
            Mascota m1 = equipo1.getNextMascota();
            Mascota m2 = equipo2.getNextMascota();
            combate(m1, m2);
            if(m1.getVida() <= 0) equipo1.removeMascota(m1);
            if(m2.getVida() <= 0) equipo2.removeMascota(m2);
        }
        if(equipo1.mascotasSize() > 0 ) return equipo1;
        if(equipo2.mascotasSize() > 0 ) return equipo2;
        return null;
    }

    public static void combate(Mascota m1, Mascota m2){
        while(m1.getVida() > 0 && m2.getVida() > 0){
            m1.atacar(m2);
        }
    }
}