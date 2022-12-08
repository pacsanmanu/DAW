import java.util.Scanner;

public class helados {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("¡Hola! ¡Bienvenido a Gelatto's!");
        System.out.println("El helado sin topping tiene un precio base de 1,90.");
        System.out.println("Los toppings disponibles son: Oreo, KitKat, Brownie y Lacasitos. ¿Quieres añadir alguno a tu helado?");
        System.out.println("Para seleccionar Oreo, introduzca 1.");
        System.out.println("Para seleccionar KitKat, introduzca 2.");
        System.out.println("Para seleccionar Brownie, introduzca 3.");
        System.out.println("Para seleccionar Lacasitos, introduzca 4.");

        int helado = sc.nextInt();

        switch (helado) {
            case 1:
                
                System.out.println("El topping de Oreo tiene un costo de 1.");
                System.out.println("El precio total de su helado es 2,90.");

                break;

            case 2:

                System.out.println("El topping de KitKat tiene un costo de 1,50.");
                System.out.println("El precio total de su helado es 3,40.");
                
                break;

            case 3:

                System.out.println("El topping de Brownie tiene un costo de 0,75.");
                System.out.println("El precio total de su helado es 2,65.");  
                
                break;

            case 4:

                System.out.println("El topping de Oreo tiene un costo de 0,95.");
                System.out.println("El precio total de su helado es 2,85.");
                
                break;
        
            default:
            System.out.println("No ha seleccionado ningún topping de los disponibles. El precio sin topping es de 1,90.");
                
                break;
        }
    }
}
