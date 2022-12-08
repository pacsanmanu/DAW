import java.util.Scanner;

public class Examen {
    public static void main(String[] args) {

        // Manuel Pacheco Sánchez, 1º DAW.
        
        Scanner sc = new Scanner(System.in);
        String volverajugar;

        System.out.println("Bienvenido a Bang! Jugaras contra la maquina al juego de pistoleros.");
        System.out.println("Es importante que conozcas que empiezas con el cargador vacio, por lo que no puedes disparar en la primera ronda.");
        System.out.println("Empecemos el juego!\n");
        
        // Bucle do while para que todo se ejecute por primera vez y al final del código pregunte si quieres volver a jugar.

        do{

            // Variables que necesito declarar al principio del programa para su correcta ejecución.

            int vidausuario = 1;
            int vidamaquina = 1;
            int balasusuario = 0;
            int balasmaquina = 0;
            int eleccionmaquina = 0;

            // Bucle for para que se vayan jugando rondas mientras que las vidas de la máquina y del usuario sean iguales a 1.

            for(int ronda = 1; vidausuario == 1 && vidamaquina == 1; ronda++){

                // Impresión del menú de opciones a escoger.

                System.out.println("\n*** Ronda " + ronda + " ***");
                System.out.println("\t1. Recargar");
                System.out.println("\t2. Bloquear");
                System.out.println("\t3. Disparar");

                // Recogemos la opción con el scanner.

                int eleccionusuario = sc.nextInt();
                System.out.println("");

                // Condiciones para la generación del número aleatorio (inteligencia artifical).

                if(balasusuario == 0 && balasmaquina == 0){

                    eleccionmaquina = 1;

                }else if(balasusuario == 0){

                    eleccionmaquina = (int) (Math.random() * 4 + 1);
                    if(eleccionmaquina <= 2 ){
                        eleccionmaquina = 1;
                    }else if(eleccionmaquina > 2 && eleccionmaquina <= 4){
                        eleccionmaquina = 3;
                    }

                }else if(balasmaquina == 0){

                    eleccionmaquina = (int) (Math.random() * 2 + 1);

                }else if(balasmaquina > 2){

                    double probabilidad = Math.random();
                    if(probabilidad < 0.25){
                        eleccionmaquina = 1;
                    }else if(probabilidad >= 0.25 && probabilidad < 0.5){
                        eleccionmaquina = 2;
                    }else if(probabilidad >= 0.5 && probabilidad <= 1){
                        eleccionmaquina = 3;
                    }

                }else{

                    eleccionmaquina = (int) (Math.random() * 3 + 1);

                }

                // Posibles escenarios siempre que las balas del usuario sean mayores que 0.

                if(balasusuario > 0){

                    if(eleccionusuario == 1 && eleccionmaquina == 1){
                        System.out.println("Has elegido recargar una bala");
                        System.out.println("La maquina ha elegido recargar una bala");
                        balasusuario++;
                        balasmaquina++;
                        System.out.println("Usuario: " + balasusuario + " balas.");
                        System.out.println("Maquina: " + balasmaquina + " balas.");
                    }

                    if(eleccionusuario == 2 && eleccionmaquina == 1){
                        System.out.println("Has elegido bloquear la bala.");
                        System.out.println("La maquina ha elegido recargar una bala");
                        System.out.println("La maquina no ha disparado, por lo que no has bloqueado nada.");
                        balasmaquina++;
                        System.out.println("Usuario: " + balasusuario + " balas.");
                        System.out.println("Maquina: " + balasmaquina + " balas.");
                    }

                    if(eleccionusuario == 3 && eleccionmaquina == 1){
                        System.out.println("Has elegido disparar una bala");
                        System.out.println("La maquina ha elegido recargar una bala");
                        System.out.println("La maquina no se ha bloqueado, por lo que RIP maquina.");
                        vidamaquina = 0;
                    }
                    
                    if(eleccionusuario == 1 && eleccionmaquina == 2){
                        System.out.println("Has elegido recargar una bala.");
                        System.out.println("La maquina ha elegido bloquear la bala.");
                        System.out.println("No has disparado, por lo que la maquina no ha bloqueado nada.");
                        balasusuario++;
                        System.out.println("Usuario: " + balasusuario + " balas.");
                        System.out.println("Maquina: " + balasmaquina + " balas.");
                    }

                    if(eleccionusuario == 2 && eleccionmaquina == 2){
                        System.out.println("Has elegido bloquear la bala.");
                        System.out.println("La maquina ha elegido bloquear la bala.");
                        System.out.println("Ninguno de los dos ha disparado, por lo que no se ha bloqueado nada.");
                        System.out.println("Usuario: " + balasusuario + " balas.");
                        System.out.println("Maquina: " + balasmaquina + " balas.");
                    }

                    if(eleccionusuario == 3 && eleccionmaquina == 2){
                        System.out.println("Has elegido disparar una bala.");
                        System.out.println("La maquina ha elegido bloquear la bala.");
                        System.out.println("La bala que has disparado ha sido bloqueada por la maquina.");
                        balasusuario--;
                        System.out.println("Usuario: " + balasusuario + " balas.");
                        System.out.println("Maquina: " + balasmaquina + " balas.");
                    }

                    if(eleccionusuario == 1 && eleccionmaquina == 3){
                        System.out.println("Has elegido recargar una bala.");
                        System.out.println("La maquina ha elegido disparar una bala.");
                        System.out.println("La maquina te ha disparado y no te has bloqueado. RIP.");
                        vidausuario--;
                    }

                    if(eleccionusuario == 2 && eleccionmaquina == 3){
                        System.out.println("Has elegido bloquear la bala.");
                        System.out.println("La maquina ha elegido disparar una bala.");
                        System.out.println("Has bloqueado la bala que ha disparado la maquina.");
                        balasmaquina--;
                        System.out.println("Usuario: " + balasusuario + " balas.");
                        System.out.println("Maquina: " + balasmaquina + " balas.");
                    }

                    if(eleccionusuario == 3 && eleccionmaquina == 3){
                        System.out.println("Has elegido disparar una bala.");
                        System.out.println("La maquina ha elegido disparar una bala.");
                        System.out.println("Ambos habeis disparado, por lo que las balas han chocado entre ellas.");
                        balasusuario--;
                        balasmaquina--;
                        System.out.println("Usuario: " + balasusuario + " balas.");
                        System.out.println("Maquina: " + balasmaquina + " balas.");
                    }

                // Posibles escenarios siempre que las balas del usuario sean iguales a 0.    

                }else if(balasusuario == 0){

                    if(eleccionusuario == 1 && eleccionmaquina == 1){
                        System.out.println("Has elegido recargar una bala");
                        System.out.println("La maquina ha elegido recargar una bala");
                        balasusuario++;
                        balasmaquina++;
                        System.out.println("Usuario: " + balasusuario + " balas.");
                        System.out.println("Maquina: " + balasmaquina + " balas.");
                    }

                    if(eleccionusuario == 2 && eleccionmaquina == 1){
                        System.out.println("Has elegido bloquear la bala.");
                        System.out.println("La maquina ha elegido recargar una bala");
                        System.out.println("La maquina no ha disparado, por lo que no has bloqueado nada.");
                        balasmaquina++;
                        System.out.println("Usuario: " + balasusuario + " balas.");
                        System.out.println("Maquina: " + balasmaquina + " balas.");
                    }

                    if(eleccionusuario == 3 && eleccionmaquina == 1){
                        System.out.println("Has elegido disparar una bala");
                        System.out.println("La maquina ha elegido recargar una bala");
                        System.out.println("No tenias ninguna bala que disparar, inutil.");
                        System.out.println("Usuario: " + balasusuario + " balas.");
                        System.out.println("Maquina: " + balasmaquina + " balas.");
                    }
                    
                    if(eleccionusuario == 1 && eleccionmaquina == 2){
                        System.out.println("Has elegido recargar una bala.");
                        System.out.println("La maquina ha elegido bloquear la bala.");
                        System.out.println("No has disparado, por lo que la maquina no ha bloqueado nada.");
                        balasusuario++;
                        System.out.println("Usuario: " + balasusuario + " balas.");
                        System.out.println("Maquina: " + balasmaquina + " balas.");
                    }

                    if(eleccionusuario == 2 && eleccionmaquina == 2){
                        System.out.println("Has elegido bloquear la bala.");
                        System.out.println("La maquina ha elegido bloquear la bala.");
                        System.out.println("Ninguno de los dos ha disparado, por lo que no se ha bloqueado nada.");
                        System.out.println("Usuario: " + balasusuario + " balas.");
                        System.out.println("Maquina: " + balasmaquina + " balas.");
                    }

                    if(eleccionusuario == 3 && eleccionmaquina == 2){
                        System.out.println("Has elegido disparar una bala.");
                        System.out.println("La maquina ha elegido bloquear la bala.");
                        System.out.println("No tenias ninguna bala que disparar, inutil.");
                        System.out.println("Usuario: " + balasusuario + " balas.");
                        System.out.println("Maquina: " + balasmaquina + " balas.");
                    }

                    if(eleccionusuario == 1 && eleccionmaquina == 3){
                        System.out.println("Has elegido recargar una bala.");
                        System.out.println("La maquina ha elegido disparar una bala.");
                        System.out.println("La maquina te ha disparado y no te has bloqueado. RIP.");
                        vidausuario--;
                    }

                    if(eleccionusuario == 2 && eleccionmaquina == 3){
                        System.out.println("Has elegido bloquear la bala.");
                        System.out.println("La maquina ha elegido disparar una bala.");
                        System.out.println("Has bloqueado la bala que ha disparado la maquina.");
                        balasmaquina--;
                        System.out.println("Usuario: " + balasusuario + " balas.");
                        System.out.println("Maquina: " + balasmaquina + " balas.");
                    }

                    if(eleccionusuario == 3 && eleccionmaquina == 3){
                        System.out.println("Has elegido disparar una bala.");
                        System.out.println("La maquina ha elegido disparar una bala.");
                        System.out.println("Ambos habeis disparado, pero tú no tenías balas, INÚTIL, muérete, ni RIP ni na.");
                        vidausuario--; 
                    }

                }
            }

        // Comprobamos que jugador ha ganado.

        System.out.println("");
        if(vidausuario == 1){
            System.out.println("Has ganado! Felicidades jefe.");
        }else if(vidamaquina == 1){
            System.out.println("Te ha ganado la maquina... Mejora crack.");
        }

        System.out.println("");

        // Recogemos si el usuario quiere volver a jugar.

        System.out.println("Quieres volver a jugar? (S/n)");
        volverajugar = sc.next();

        
    }while(volverajugar.equalsIgnoreCase("S"));

    }
}
