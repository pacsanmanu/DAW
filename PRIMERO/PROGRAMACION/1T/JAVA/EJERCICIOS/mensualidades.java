import java.util.Scanner;

public class mensualidades {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 

       System.out.println("Introduzca la cantidad de meses:");
       int meses = sc.nextInt();
       int contadormeses = 1;
       int pago = 10;
       int pagototal = 0;

       while(contadormeses <= meses){
        System.out.println("El " + contadormeses + " mes el usuario paga " + pago + " euros");
        pago = pago * 2;
        contadormeses++;
        pagototal = pagototal + pago;
       }

       System.out.println("\nEn total el usuario debe pagar " + pagototal + " euros");
    }
}
