import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;

public class Ejercicio3 {
    public static void main(String[] args) {
        FileWriter fichero = null;
        String texto = "hola muy buenisimos dias";
        try{
            fichero = new FileWriter("codificado.txt");
            for(int i = 0; i < texto.length(); i++){
                fichero.write(((int)texto.charAt(i)) + " ");
            }
            fichero.close();
            File fichero1 = new File("codificado.txt");
            Scanner lector = new Scanner(fichero1);  
            String decodificado = ""; 
            while(lector.hasNextInt()){
                decodificado += (char) lector.nextInt();
            }
            System.out.println(decodificado);
            lector.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
