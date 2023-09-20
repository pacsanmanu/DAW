import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import Clases.*;

public class Main {
    public static void main(String[] args) {

        // Manuel Pacheco Sánchez, 1º DAW

        Scanner sc = new Scanner(System.in);
        int cont = 1;
        int aux = 0;
        int opcion = 0;
        Profesor juan = new Profesor(4, "Juan", LocalDate.of(1965,12,22), LocalDate.now());
        Usuario manuel = new Usuario(1, "Manuel", LocalDate.of(1999,12,22));
        Pelicula torrente = new Pelicula(1, "Torrente", 2.30, 18, 500, "Comedia");
        Pelicula torrente2 = new Pelicula(6, "Torrente 2", 2.30, 18, 350, "Comedia");
        Pelicula torrente3 = new Pelicula(7, "Torrente 3", 2.30, 18, 50, "Comedia");
        Pelicula torrente4 = new Pelicula(8, "Torrente 4", 2.30, 18, 150, "Comedia");
        Pelicula torrente5 = new Pelicula(9, "Torrente 5", 2.30, 18, 250, "Comedia");
        Pelicula torrente6 = new Pelicula(10, "Torrente 6", 2.30, 18, 150, "Comedia");
        Pelicula torrente7 = new Pelicula(11, "Torrente 7", 2.30, 18, 550, "Comedia");
        Pelicula torrente8 = new Pelicula(12, "Torrente 8", 2.30, 18, 250, "Comedia");
        Pelicula torrente9 = new Pelicula(13, "Torrente 9", 2.30, 18, 350, "Comedia");
        Serie strangerThings = new Serie(3, "Stranger Things", 150, 13, 1500, "Suspense", 40, 4);
        Serie naruto = new Serie(4, "Naruto Shippuden", 300, 7, 2500, "Anime", 500, 3);
        CanalProfesor juanLeonHD = new CanalProfesor(5, "Juan Leon, La bestia, ahora en HD", 25, 18, 19500, juan);
        PlataformaStreaming ADAFLIX = new PlataformaStreaming(1, "ADAFLIX", 2.95);
        PlataformaStreaming ADAFLIXHD = new PlataformaStreaming(2, "ADAFLIX HD", 19.95);
        manuel.setSaldo(25);
        ArrayList<PlataformaStreaming> plataformas = new ArrayList<PlataformaStreaming>();
        plataformas.add(ADAFLIX);
        plataformas.add(ADAFLIXHD);
        ArrayList<Contenido> contenidos = new ArrayList<>();
        contenidos.add(torrente);
        contenidos.add(torrente2);
        contenidos.add(torrente3);
        contenidos.add(torrente4);
        contenidos.add(torrente5);
        contenidos.add(torrente6);
        contenidos.add(torrente7);
        contenidos.add(torrente8);
        contenidos.add(torrente9);
        contenidos.add(strangerThings);
        contenidos.add(naruto);
        contenidos.add(juanLeonHD);
        ADAFLIX.setContenidos(contenidos);
        ADAFLIXHD.setContenidos(contenidos);
        // El usuario que vamos a usar para todas las pruebas es Manuel.

        System.out.println("Bienvenido a ADAFLIX: Gestión de plataformas en streaming.");

        while(opcion != 6){
            cont = 1;
            System.out.println("1. Listar las distintas plataformas");
            System.out.println("2. Suscribirse a una plataforma");
            System.out.println("3. Darse de baja de una plataforma");
            System.out.println("4. Listar el contenido según el tipo (película, serie o canal profesorado)");
            System.out.println("5. Mostrar el TOP 10 de los contenidos");
            System.out.println("6. Salir\n");
            System.out.println("Introduzca una opción: ");
            opcion = sc.nextInt();
            while(opcion <= 0 && opcion > 6){
                System.out.println("No ha introducido una opció válida.\n");
                System.out.println("Introduzca una opción: ");
                opcion = sc.nextInt();
            }
            if(opcion == 1){
                System.out.println("\nListado de plataformas:");
                for(PlataformaStreaming p : plataformas){
                    System.out.println(cont + ") " + p + "\n");
                    cont++;
                }
            }else if(opcion == 2){
                System.out.println("\n¿En qué plataforma quieres darte de alta?\n");
                for(PlataformaStreaming p : plataformas){
                    System.out.println(cont + ") " + p + "\n");
                    cont++;
                }
                aux = sc.nextInt();
                manuel.darAltaPlataforma(plataformas.get(aux - 1));
                System.out.println("El usuario tiene ahora estas suscripciones: \n");
                System.out.println(manuel.getPlataformasStreaming() + "\n");
            }else if(opcion == 3){
                System.out.println("\n¿En qué plataforma quieres darte de baja?\n");
                for(PlataformaStreaming p : manuel.getPlataformasStreaming()){
                    System.out.println(cont + ") " + p + "\n");
                    cont++;
                }
                aux = sc.nextInt();
                manuel.darBajaPlataforma(plataformas.get(aux - 1));
                System.out.println("El usuario tiene ahora estas suscripciones: \n");
                System.out.println(manuel.getPlataformasStreaming());
            }else if(opcion == 4){
                System.out.println("\n¿Qué contenidos quieres listar?\n");
                System.out.println("1. Película");
                System.out.println("2. Serie");
                System.out.println("3. Canal Profesorado");
                System.out.println("Elige una opción: ");
                aux = sc.nextInt();
                if(aux == 1){
                    for(Contenido c : ADAFLIX.getContenidos()){
                        if(c instanceof Pelicula){
                            System.out.println(c);
                        }
                    }
                }else if(aux == 2){
                    for(Contenido c : ADAFLIX.getContenidos()){
                        if(c instanceof Serie){
                            System.out.println(c);
                        }
                    }
                }else if(aux == 3){
                    for(Contenido c : ADAFLIX.getContenidos()){
                        if(c instanceof CanalProfesor){
                            System.out.println(c);
                        }
                    }
                }
                System.out.println();
            }else if(opcion == 5){
                System.out.println(ADAFLIX.obtenerTopDiez());
            }
    }
    System.out.println("\nGracias por utilizar ADAFLIX :)");
    }
}
