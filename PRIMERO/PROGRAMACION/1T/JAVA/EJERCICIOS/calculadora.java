import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {

        String salir;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Hola! Bienvenido a calculator777, que operación quiere realizar? Escoja la operación introduciendo su número del menú.");

        do{

            System.out.println("\n1. Suma\n2. Resta\n3. Multiplicación\n4. División\n");
            int eleccion = sc.nextInt();

            while (eleccion != 1 && eleccion != 2 && eleccion != 3 && eleccion != 4 ){
                System.out.println("Escoja una opción válida.");
                eleccion = sc.nextInt();
            }
            
            if (eleccion == 1){
                System.out.println("Introduzca el primer número.");
                int numero1 = sc.nextInt();
                System.out.println("Introduzca el número que quiera sumarle.");
                int numero2 = sc.nextInt();
                int resultado = numero1 + numero2;
                System.out.println("El resultado de la suma es: " + resultado);
            }
        
            if (eleccion == 2){
                System.out.println("Introduzca el primer número.");
                int numero1 = sc.nextInt();
                System.out.println("Introduzca el número que quiera restarle.");
                int numero2 = sc.nextInt();
                int resultado = numero1 - numero2;
                System.out.println("El resultado de la resta es: " + resultado);
            }

            if (eleccion == 3){
                System.out.println("Introduzca el primer número.");
                int numero1 = sc.nextInt();
                System.out.println("Introduzca el número que quiera multiplicarle.");
                int numero2 = sc.nextInt();
                int resultado = numero1 * numero2;
                System.out.println("El resultado de la multiplicación es: " + resultado);
            }
            
            if (eleccion == 4){
                System.out.println("Introduzca el primer número.");
                int numero1 = sc.nextInt();
                System.out.println("Introduzca el número que quiera dividirle.");
                int numero2 = sc.nextInt();
                int resultado = numero1 / numero2;
                System.out.println("El resultado de la división es: " + resultado);
            }


            System.out.println("¿Quieres realizar otra operación?");
            salir = sc.next();

        } while (!salir.equals("no"));
        
        
    }
}
