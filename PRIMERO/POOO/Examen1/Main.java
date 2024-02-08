import java.util.Scanner;
import Clases.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tienda alohomora = new Tienda("Alohomora");
        boolean exit = false;
        System.out.println("Bienvenido a mi tienda!");
        while(!exit){
            System.out.println("¿Qué servicio quieres utilizar?");
            System.out.println();
            System.out.println("1. Ver libros");
            System.out.println("2. Ver clientes");
            System.out.println("3. Buscar libro");
            System.out.println("4. Vender libro");
            System.out.println("5. Registrar libro");
            System.out.println("6. Registrar cliente");
            System.out.println("0. Salir");
            System.out.println("Introduzca una opción: ");
            int opcion = sc.nextInt();

            if(opcion < 0 && opcion > 6){
                System.out.println("No ha escogido una opción válida. Elija una nueva opción: ");
                opcion = sc.nextInt();
            }

            if(opcion == 1){
                alohomora.listar();
            }

            if(opcion == 2){
                alohomora.verClientes();
            }

            if(opcion == 3){
                System.out.println("Mediante qué parámetro quieres filtrar?");
                System.out.println();
                System.out.println("1. Título");
                System.out.println("2. Autor");
                System.out.println("3. Categoría");
                System.out.println("Elige una opción: ");
                int filtrado = sc.nextInt();
                alohomora.listar(filtrado);
            }

            if(opcion == 4){
                alohomora.verClientes();
                System.out.println("Elija un comprador: ");
                int indice = sc.nextInt();
                Cliente cliente = alohomora.getClientes().get(indice - 1);
                alohomora.listar();
                System.out.println("Elija un libro:");
                indice = sc.nextInt();
                Libro libro = alohomora.getLibros().get(indice - 1);
                alohomora.venderLibro(cliente, libro);
            }

            if(opcion == 5){
                alohomora.addLibro();
            }

            if(opcion == 6){
                alohomora.addCliente();
            }

            if(opcion == 0){
                exit = true;
            }
        }
        System.out.println("¡Vuelve pronto!");
    }
}
