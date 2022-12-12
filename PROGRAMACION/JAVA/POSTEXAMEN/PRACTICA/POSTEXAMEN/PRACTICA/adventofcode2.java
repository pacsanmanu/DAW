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
        int elfoseleccionado = 0;
        int contelfo = 0;
        int contelfo2 = 0;
        int contelfo3 = 0;
        int contaux = 0;

        String[] elfos = Utils.LeerFichero("C:\\day1.txt");

        for(int i = 0; i < elfos.length; i++){
            if(!elfos[i].equals("")){
                valor = Integer.parseInt(elfos[i]);
                aux += valor;
            }else{
                elfoseleccionado++;
                if(aux > suma){
                    contelfo = elfoseleccionado;
                    suma = aux;
                }
                aux = 0;
            }
        }

        elfoseleccionado = 0;
        aux = 0;

        for(int i = 0; i < elfos.length; i++){
            if(!elfos[i].equals("")){
                valor = Integer.parseInt(elfos[i]);
                aux += valor;
            }else{
                elfoseleccionado++;
                if(aux > suma2){
                    contaux = contelfo2;
                    contelfo2 = elfoseleccionado;
                    if(contelfo != contelfo2){
                        suma2 = aux;
                    }else{
                        contelfo2 = contaux;
                    }
                }
                aux = 0;
            }
        }

        elfoseleccionado = 0;
        contaux = 0;
        aux = 0;

        for(int i = 0; i < elfos.length; i++){
            if(!elfos[i].equals("")){
                valor = Integer.parseInt(elfos[i]);
                aux += valor;
            }else{
                elfoseleccionado++;
                if(aux > suma3){
                    contaux = contelfo3;
                    contelfo3 = elfoseleccionado;
                    if(contelfo != contelfo3 && contelfo2 != contelfo3){
                        suma3 = aux;
                    }else{
                        contelfo3 = contaux;
                    }
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
