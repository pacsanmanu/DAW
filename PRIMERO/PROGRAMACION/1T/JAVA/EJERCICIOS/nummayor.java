public class nummayor {
    public static void main(String[] args) {
        if (args.length < 2) return;
        
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        
        if (num1 > num2) {
            System.out.println("El mayor es " + num1);
        } else if (num1 < num2) {
            System.out.println("El mayor es " + num2);
        } else {
            System.out.println("Los numeros son iguales");
        }
    }
}
