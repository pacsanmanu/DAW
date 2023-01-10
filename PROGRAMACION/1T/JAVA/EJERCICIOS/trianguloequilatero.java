public class trianguloequilatero {
    public static void main(String[] args) {
        
        int cantidad = 0;

        for (int i = 1; i <= 4; i++){
            for(cantidad = i; cantidad <= 4; cantidad++){    
                System.out.print(" ");
            }
            for(cantidad = 1; cantidad <= i; cantidad++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

}