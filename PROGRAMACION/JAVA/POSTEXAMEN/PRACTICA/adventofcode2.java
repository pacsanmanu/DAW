package POSTEXAMEN.PRACTICA;
import java.util.Arrays;
import POSTEXAMEN.PRACTICA.Utils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class adventofcode2 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        int suma = 0;
        int valor = 0;
        int aux = 0;
        int suma2 = 0;
        int suma3 = 0;

        String[] elfos = Utils.LeerFichero("C:\\day1.txt");

        for(int i = 0; i < elfos.length; i++){
            if(!elfos[i].equals("")){
                valor = Integer.parseInt(elfos[i]);
                aux += valor;
            }else{
                if(aux > suma){
                    suma = aux;
                }
                aux = 0;
            }
        }

        aux = 0;

        for(int i = 0; i < elfos.length; i++){
            if(!elfos[i].equals("")){
                valor = Integer.parseInt(elfos[i]);
                aux += valor;
            }else{
                if(aux == suma){
                    break;
                }else if(aux > suma2){
                    suma2 = aux;
                }
                aux = 0;
            }
        }

        aux = 0;

        for(int i = 0; i < elfos.length; i++){
            if(!elfos[i].equals("")){
                valor = Integer.parseInt(elfos[i]);
                aux += valor;
            }else{
                if(aux == suma || aux == suma2){
                    break;
                }else if(aux > suma3){
                    suma3 = aux;
                }
                aux = 0;
            }
        }

        System.out.println(suma);
        System.out.println(suma2);
        System.out.println(suma3);
        System.out.println(suma + suma2 + suma3);

    }
}
