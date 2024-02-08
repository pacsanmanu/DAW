public class nums {
    public static void main(String[] args) {
        if(args.length < 1) return;
        
        int numero = Integer.parseInt(args[0]);
        int numero2 = Integer.parseInt(args[0]);
        int numero3 = Integer.parseInt(args[0]);
        int potencia = numero3;

        System.out.println("Los 3 siguientes números son: ");

        for (int i = 0; i < 3; i++){
            numero++;
            System.out.println(numero);
        }

        System.out.println("Los 3 anteriores números son: ");

        for (int j = 0; j < 3; j++){
            numero2--;
            System.out.println(numero2);
        }

        System.out.println("Las 3 siguientes potencias son: ");

        for (int k = 0; k < 3; k++){
            potencia = potencia * numero3;
            System.out.println(potencia);
        }

    }
}
