public class condicional {
    public static void main(String[] args) {
        int numero = Integer.parseInt(args[0]);
        
        if(numero > 3 && numero <= 10){
            System.out.println("El numero es bombizzima");
        }else if(numero > 10 && numero <= 20){
            System.out.println("El numero es un poco bombizzima");
        }else{
            System.out.println("Mu buen numero xurra");
        }
    }
}