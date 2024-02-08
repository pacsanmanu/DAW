public class Ej3 {
    public static void main(String[] args) {

        char[][] resultados = new char[15][5];
        
        System.out.print("             ");
        for(int i = 0; i < 5; i++){
            System.out.print("| 1 x 2 ");
        }

        System.out.print("|");
        System.out.println("");
        System.out.println("");

        for(int i = 0; i < 15; i++){
            System.out.print("Partido " + (i+1));
            if(i < 9){
                System.out.print("        ");
            }else{
                System.out.print("       ");
            }
            for(int j = 0; j < 5; j++){
                int numero = (int)(Math.random() * 100);
                if(numero <= 50){
                    resultados[i][j] = '1';
                    System.out.print(resultados[i][j]);
                }else if(numero > 50 && numero <= 80){
                    resultados[i][j] = 'X';
                    System.out.print(resultados[i][j]);
                }else{
                    resultados[i][j] = '2';
                    System.out.print(resultados[i][j]);
                }
                System.out.print("       ");
            }
            System.out.println("");
        }
    }
}
