import java.util.Scanner;

public class notas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el nombre del alumno");
        String nombre = scanner.nextLine();
        
        System.out.println("Introduzca la primera nota");
        double nota1 = scanner.nextDouble();
        
        System.out.println("Introduzca la segunda nota");
        double nota2 = scanner.nextDouble();
        
        System.out.println("Introduzca la tercera nota");
        double nota3 = scanner.nextDouble();
        
        double notaFinal = nota1 + nota2 + nota3;
        notaFinal = notaFinal / 3; 

        System.out.println("La nota final del alumno " + nombre + " es: " + notaFinal);

    }
}
