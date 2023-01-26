package Ej6;

import java.util.Date;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.Calendar;

import Ej6.Clases.*;

public class Main {
public static void main(String[] args) {

    Calendar calendar = Calendar.getInstance();
    calendar.set(Calendar.YEAR, 1985);
    calendar.set(Calendar.MONTH, Calendar.JUNE);
    calendar.set(Calendar.DATE, 25);
    
    Jugador j1 = new Jugador("Chevantón", calendar.getTime(), "España", "Delantero", 10, "SEVILLA FC");
    
    System.out.println(j1.toString());
    
    Equipo SevillaFC = new Equipo("Sevilla FC", "2022-2023");

    SevillaFC.setPartidosJugados(15);
    SevillaFC.setPartidosGanados(3);
    SevillaFC.setPartidosPerdidos(12);
    
    System.out.println(SevillaFC);
    }
    
}