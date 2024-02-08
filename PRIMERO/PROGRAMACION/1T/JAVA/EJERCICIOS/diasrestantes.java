import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class diasrestantes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el día.");
        int dia = sc.nextInt();

        System.out.println("Introduzca el mes.");
        int mes = (sc.nextInt() - 1);

        System.out.println("Introduzca el año.");
        int año = sc.nextInt();
        
        Calendar calendario = Calendar.getInstance();
        
        calendario.set(Calendar.YEAR, año);
        calendario.set(Calendar.MONTH, mes);
        calendario.set(Calendar.DATE, dia);
        
        System.out.println("La fecha actual es: " + calendario.get(Calendar.DATE) + "/" + (calendario.get(Calendar.MONTH) + 1) + "/" + calendario.get(Calendar.YEAR));

        int diadelaño = calendario.get(Calendar.DAY_OF_YEAR);

        Calendar calendario2 = new GregorianCalendar(año, 11, 31);
        
        int diamaximo = calendario2.get(Calendar.DAY_OF_YEAR);

        int diasrestantes = diamaximo - diadelaño;

        System.out.println("Los dias restantes son: " + diasrestantes);

    }
}
