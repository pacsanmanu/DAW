package Ej19;

import java.time.LocalDate;

import Ej19.Clases.*;

public class Main {
    public static void main(String[] args) {
        Persona manuelpaco = new Persona("Manuel", "Paco");
        Servicio chapucilla = new TrabajoPintura(manuelpaco, LocalDate.now(), "Paco Sanz", 55, 700);
        Servicio alarmitas = new RevisionAlarma(manuelpaco, LocalDate.now(), "CR7", 3);

        Servicio[] chapus = {
            chapucilla, alarmitas
        };

        for(Servicio s : chapus){
            System.out.println(s.detalleServicio());
            System.out.println("");
        }
    }
}
