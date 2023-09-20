package Clases;
import java.util.ArrayList;
import java.util.Scanner;

public class MaquinaExpendedora {
    private ArrayList<Articulo> articulos;

    public MaquinaExpendedora(){
        articulos = new ArrayList<Articulo>();
    }

    public void Load(){
        for(int i = 0; i < Datos.DATOS_ARTICULOS.length; i++){
            this.articulos.add(Datos.DATOS_ARTICULOS[i]);
                System.out.println("Se ha cargado el artículo " + Datos.DATOS_ARTICULOS[i].getNombre());
        }
        System.out.println("\nSe han cargado todos los artículos.\n");
    }

    public void Start(){
        int eleccion = -1;
        do{
            eleccion = Menu();
        }while(eleccion != 0);
        System.out.println("¡Gracias por su compra!");
    }

    public int Menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Menú de la máquina expendedora\n");
        System.out.println("1. Ver artículos");
        System.out.println("2. Comprar artículo");
        System.out.println("3. Introducir artículo");
        System.out.println("4. Poner al día");
        System.out.println("5. Caducar consumibles");
        System.out.println("0. Salir\n");
        System.out.println("¿Que opción quiere ejecutar?");
        int eleccion = sc.nextInt();
        if(eleccion == 1){
            verArticulos();
        }else if(eleccion == 2){
            comprarArticulo();
        }else if(eleccion == 3){
            insertarArticulo();
        }else if(eleccion == 4){
            actualizarArticulos();
        }else if(eleccion == 5){
            comprobarArticulos();
        }
        return eleccion;
    }

    public void verArticulos(){
        int contador = 1;
        for(Articulo a : articulos){
            System.out.println(contador + ") " + a + "\n");
            contador++;
        }
    }

    public void comprarArticulo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuánto dinero quieres introducir?");
        double credito = sc.nextDouble();
        System.out.println("Qué artículo quiere comprar?\n");
        verArticulos();
        int eleccion = sc.nextInt();
        if(articulos.get(eleccion-1).getPrecio() < credito){
            System.out.println("Ha comprado el artículo.");
            articulos.remove(articulos.get(eleccion - 1));
        }
    }

    public void insertarArticulo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Que artículo quiere añadir?\n");
        System.out.println("1. Juguete");
        System.out.println("2. Tabaco");
        System.out.println("3. Bebida");
        System.out.println("4. Salado");
        System.out.println("5. Dulce");
        int eleccion = sc.nextInt();

        if(eleccion == 1){
            System.out.println("Nombre del juguete: ");
            String nombre = sc.next();
            System.out.println("Codigo del juguete: ");
            String codigo = sc.next();
            System.out.println("Precio del juguete: ");
            double precio = sc.nextDouble();

            articulos.add(new Juguete(nombre, codigo, precio));
        }else if(eleccion == 2){
            System.out.println("Nombre del tabaco: ");
            String nombre = sc.next();
            System.out.println("Codigo del tabaco: ");
            String codigo = sc.next();
            System.out.println("Precio del tabaco: ");
            double precio = sc.nextDouble();

            articulos.add(new Tabaco(nombre, codigo, precio));
        }else if(eleccion == 3){
            System.out.println("Nombre de la bebida: ");
            String nombre = sc.next();
            System.out.println("Codigo de la bebida: ");
            String codigo = sc.next();
            System.out.println("Precio de la bebida: ");
            double precio = sc.nextDouble();
            System.out.println("Nutrientes de la bebida: ");
            double nutrientes = sc.nextDouble();
            System.out.println("Grasas de la bebida: ");
            double grasas = sc.nextDouble();

            articulos.add(new Bebida(nombre, codigo, precio, nutrientes, grasas));
        }else if(eleccion == 4){
            System.out.println("Nombre del salado: ");
            String nombre = sc.next();
            System.out.println("Codigo del salado: ");
            String codigo = sc.next();
            System.out.println("Precio del salado: ");
            double precio = sc.nextDouble();
            System.out.println("Nutrientes del salado: ");
            double nutrientes = sc.nextDouble();
            
            articulos.add(new Salado(nombre, codigo, precio, nutrientes));
        }else if(eleccion == 5){
            System.out.println("Nombre del dulce: ");
            String nombre = sc.next();
            System.out.println("Codigo del dulce: ");
            String codigo = sc.next();
            System.out.println("Precio del dulce: ");
            double precio = sc.nextDouble();
            System.out.println("Grasas del dulce: ");
            double grasas = sc.nextDouble();
            
            articulos.add(new Dulce(nombre, codigo, precio, grasas));
        }
        System.out.println("Se ha creado correctamente el artículo");
    }

    public void actualizarArticulos(){
        for(int i = 0; i < articulos.size(); i++){
            if(articulos.get(i) instanceof Bebida){
                Bebida b = (Bebida)articulos.get(i);
                if(b.isCaducado()){
                    System.out.println("Se ha eliminado el artículo " + articulos.get(i));
                    articulos.remove(i);
                    i--;
                }
            }else if(articulos.get(i) instanceof Comida){
                Comida c = (Comida)articulos.get(i);
                if(c.isCaducado()){
                    System.out.println("Se ha eliminado el artículo " + articulos.get(i));
                    articulos.remove(i);
                    i--;
                }
            }
        }
    }

    public void comprobarArticulos(){
        for(Articulo a : articulos){
            if(a instanceof Bebida){
                Bebida b = (Bebida) a;
                b.caducar();
                if(b.isCaducado()){
                    System.out.println("Se ha caducado el artículo " + a);
                }
            }else if(a instanceof Comida){
                Comida c = (Comida) a;
                c.caducar();
                if(c.isCaducado()){
                    System.out.println("Se ha caducado el artículo " + a);
                }
            }
        }
    }
}
