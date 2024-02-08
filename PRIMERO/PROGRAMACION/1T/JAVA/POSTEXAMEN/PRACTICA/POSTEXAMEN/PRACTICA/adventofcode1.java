package POSTEXAMEN.PRACTICA;
import java.util.Arrays;
import POSTEXAMEN.PRACTICA.Utils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class adventofcode1 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        int suma = 0;
        int aux = 0;
        int suma2 = 0;
        int suma3 = 0;

        String[] elfos = Utils.LeerFichero("C:\\day1.txt");

        for(int i = 0; i < elfos.length; i++){
            if(!elfos[i].equals("")){
                int valor = Integer.parseInt(elfos[i]);
                aux += valor;
            }else{
                if(aux > suma){
                    suma = aux;
                }
                aux = 0;
            }
        }
        System.out.println(suma);
    }
}
