import java.util.Arrays;

public class mayor_menor {
    public static void main(String[] args) {

    if((args[0] != args[1] && args[0] != args[2] && args[0] != args[3]) && (args[1] != args[2] && args[1] != args[3]) && (args[2] != args[3])) {

        Arrays.sort(args);
        System.out.println("El menor número posible es el " + args[0] + args[1] + args[2] + args[3]);
        System.out.println("El mayor número posible es el " + args[3] + args[2] + args[1] + args[0]);

    }else{

        System.out.println("Los números introducidos no pueden ser iguales");
    }
    }
}
