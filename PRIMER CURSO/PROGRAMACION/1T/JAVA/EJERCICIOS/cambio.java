import java.util.Scanner;

public class cambio {
    public static void main(String[] args) {

        // Recogemos importes y calculamos la diferencia.

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el precio del importe");
        Double precio = sc.nextDouble();

        System.out.println("Introduzca el importe pagado");
        Double pago = sc.nextDouble();

        // Comprobamos si el dinero que va a pagar es suficiente.

        if (precio > pago){
            System.out.println("El importe introducido es menor al que debe pagar.");
        }else if (precio == pago){
            System.out.println("El importe pagado es exacto. No se le tiene que devolver nada.");
        }else{

            Double cambio = pago - precio;

            // Calculamos cuantas monedas o billetes se devuelven de cada tipo.
     
            cambio = (cambio * 100) / 100;
    
            double cont500 = cambio / 500;
            cambio = ((cambio % 500) * 100) / 100;
            Math.floor(cambio);   
            if (cont500 >= 1) {System.out.println((int)cont500 + " billete/s de 500 euros");}
            
            double cont200 = cambio / 200;
            cambio = ((cambio % 200) * 100) / 100;
            Math.floor(cambio);   
            if (cont500 >= 1) {System.out.println((int)cont200 + " billete/s de 200 euros");}
            
            double cont100 = cambio / 100;
            cambio = ((cambio % 100) * 100) / 100;
            Math.floor(cambio);   
            if (cont100 >= 1) {System.out.println((int)cont100 + " billete/s de 100 euros");}
            
            double cont50 = cambio / 50;
            cambio = ((cambio % 50) * 100) / 100;  
            Math.floor(cambio); 
            if (cont50 >= 1) {System.out.println((int)cont50 + " billete/s de 50 euros");}
            
            double cont20 = cambio / 20;
            cambio = ((cambio % 20) * 100) / 100;   
            Math.floor(cambio);
            if (cont20 >= 1) {System.out.println((int)cont20 + " billete/s de 20 euros");}
            
            double cont10 = cambio / 10;
            cambio = ((cambio % 10) * 100) / 100;  
            Math.floor(cambio); 
            if (cont10 >= 1) {System.out.println((int)cont10 + " billete/s de 10 euros");}
            
            double cont5 = cambio / 5;
            cambio = ((cambio % 5) * 100) / 100;   
            Math.floor(cambio);
            if (cont5 >= 1) {System.out.println((int)cont5 + " billete/s de 5 euros");}
            
            double cont2 = cambio / 2;
            cambio = ((cambio % 2) * 100) / 100;   
            Math.floor(cambio);
            if (cont2 >= 1) {System.out.println((int)cont2 + " moneda/s de 2 euros");}
            
            double cont1 = cambio / 1;
            cambio = ((cambio % 1) * 100) / 100;   
            Math.floor(cambio);
            if (cont1 >= 1) {System.out.println((int)cont1 + " moneda/s de 1 euro");}
            
            double cont50c = cambio / 0.5;
            cambio = ((cambio % 0.5) * 100) / 100; 
            Math.floor(cambio);  
            if (cont50c >= 1) {System.out.println((int)cont50c + " moneda/s de 50 centimos");}
            
            double cont20c = cambio / 0.2;
            cambio = ((cambio % 0.2) * 100) / 100; 
            Math.floor(cambio);  
            if (cont20c >= 1) {System.out.println((int)cont20c + " moneda/s de 20 centimos");}
            
            double cont10c = cambio / 0.1;
            cambio = ((cambio % 0.1) * 100) / 100; 
            Math.floor(cambio);  
            if (cont10c >= 1) {System.out.println((int)cont10c + " moneda/s de 10 centimos");}
            
            double cont5c = cambio / 0.05;
            cambio = ((cambio % 0.05) * 100) / 100;
            Math.floor(cambio);   
            if (cont5c >= 1) {System.out.println((int)cont5c + " moneda/s de 5 centimos");}
            
            double cont2c = cambio / 0.02;
            cambio = ((cambio % 0.02) * 100) / 100;
            Math.floor(cambio);   
            if (cont2c >= 1) {System.out.println((int)cont2c + " moneda/s de 2 centimos");}
            
            if (cambio > 0.001){
                double cont1c = 1;
                System.out.println((int)cont1c + " moneda/s de 1 centimo");
            }else{
                double cont1c = 0;
            } 

        }

       

    }
}