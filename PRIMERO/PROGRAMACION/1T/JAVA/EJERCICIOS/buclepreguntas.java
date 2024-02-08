import java.util.Scanner;

public class buclepreguntas {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Se habla de un tema.");
        System.out.println("Conoces algo sobre el tema? Responda si o no.");
        String respuesta = sc.next();

        if(respuesta.equals("si")){
            System.out.println("Estupendo, pues habla del tema.");
        }else if(respuesta.equals("no")){
            while(!respuesta.equals("si")){

                if(respuesta.equals("no")){
                    System.out.println("Te vas a enterar por españa makina");
                }
                System.out.println("Quieres informarte del tema?");
                respuesta = sc.next();
            }
        }
        System.out.println("\nHasta luego makina, espero que hayas disfrutado de la explicacion.");
    }
}
