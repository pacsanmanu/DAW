package POSTEXAMEN.ARRAYS;

public class arraynumerosaleatorios {
    public static void main(String[] args) {
        
        int[] array = new int[20];
        int[] arrayprimos = new int[20];
        int numeroaleatorio = 0;
        int contadorprimos = 0;

        for(int i = 0; i < array.length; i++){
            numeroaleatorio = (int)(Math.random() * 100);
            array[i] = numeroaleatorio;
        }

        for(int i = 0; i < array.length; i++){
            boolean primo = true;
            for( int j = 2; j < array[i]; j++ ){
                if(array[i] % j == 0){
                    primo = false;
                    break;
                }
            }
            if(primo){
                arrayprimos[contadorprimos] = array[i];
                contadorprimos++;
            }
        }

        System.out.print("Los números generados son: ");
        System.out.print("[");
        for(int numero : array){
            System.out.print(numero + ", ");
        }

        System.out.println("]");
        System.out.println("");
        System.out.print("Los números primos son: ");
        System.out.print("[");

        for(int i = 0; i < arrayprimos.length - 1; i++){
            if(arrayprimos[i] != 0){
                System.out.print(arrayprimos[i] + ", ");
            }
        }
        
        System.out.print("]");
        
    }
}