public class stringiguales {
    public static void main(String[] args) {
        if(args.length < 2) return;

        String string1 = args[0];
        String string2 = args[1];
        
        if (string1.equals(string2)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }
    }
}
