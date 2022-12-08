import java.util.concurrent.TimeUnit;

public class reloj {
    public static void main(String[] args) throws InterruptedException {
    
        int horas = 0;
        int minutos = 0;
        int segundos = 0;
        String borrar = "\b\b\b\b\b\b\b\b";

        while (horas < 24){

            while (minutos < 60){

                while (segundos < 60){
                    System.out.printf("%02d:%02d:%02d", horas, minutos, segundos);

                    Thread.sleep(1000);

                    System.out.printf(borrar);

                    segundos++;
                }
            segundos = 0;
            minutos++;
            }
        minutos = 0;
        horas++;
        }
    horas = 0;
    }
}
