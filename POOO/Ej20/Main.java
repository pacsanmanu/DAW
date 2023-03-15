package Ej20;
import java.time.LocalDate;
import java.util.ArrayList;

import Ej20.Clases.*;

public class Main {
    public static void main(String[] args) {
        Barco titanic = new Barco("Titanic", "Crucero", 1000);
        Sala putas = new Sala("Putas", 2);
        
        Tripulante pepito = new Capitan(1, 45, 550, "Pepito");
        Tripulante paquito = new Marinero(2, 35, 250, "Paquito", 400);
        Tripulante jorgito = new JefeFlota(3, 60, 900, "Jorgito");
        Tripulante jesus = new Capitan(4, 123, 334, "Jesus");
        
        putas.addRango(jorgito);
        putas.addRango(paquito);
        putas.entrar(jorgito);
        putas.entrar(paquito);
        putas.entrar(jesus);

        System.out.println(putas.getTripulantes());

        ArrayList<Tripulante> tripulantes = new ArrayList<Tripulante>();
        tripulantes.add(pepito);
        tripulantes.add(paquito);
        tripulantes.add(jorgito);

        GPS brujula = new GPS(25.5534, -12.53442, LocalDate.now());

        titanic.addTripulante(jesus);

        titanic.setGps(brujula);
        titanic.setTripulantes(tripulantes);

        System.out.println(titanic.getTripulantes());

        for(Tripulante t : titanic.getTripulantes()){
            System.out.println(t.sueldo());
        }
    }
}
