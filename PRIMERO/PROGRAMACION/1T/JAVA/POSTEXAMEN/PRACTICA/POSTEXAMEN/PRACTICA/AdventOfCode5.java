package POSTEXAMEN.PRACTICA;
import POSTEXAMEN.PRACTICA.Utils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class AdventOfCode5 {
    public static void main(String[] args) throws FileNotFoundException, IOException  {
        
        int sum = 0;
        int rechazo = 0;
        String coincidencias = "";
        
        String[] inventory = Utils.LeerFichero("C:\\day3.txt");
        
        for(int i = 0; i < inventory.length; i++){

            String t1 = inventory[i].substring(0, inventory[i].length() / 2);
            String t2 = inventory[i].substring(inventory[i].length() / 2);

            for(int j = 0; j < inventory[i].length() / 2; j++){
                for(int k = 0; k < inventory[i].length() / 2; k++){
                    if(t1.charAt(j) == t2.charAt(k)){
                        for(int x = 0; x < coincidencias.length(); x++){
                            if(t1.charAt(j) == coincidencias.charAt(x)){
                                rechazo++;
                            }
                        }
                        if(rechazo == 0){
                            coincidencias += t1.charAt(j);
                        }
                    }
                }
                rechazo = 0;
            }
            for(int j = 0; j < coincidencias.length(); j++){
                if((int)coincidencias.charAt(j) > 64 && (int)coincidencias.charAt(j) < 91 ){
                    sum += (int)coincidencias.charAt(j) - 38;
                }else if((int)coincidencias.charAt(j) > 96 && (int)coincidencias.charAt(j) < 123 ){
                    sum += (int)coincidencias.charAt(j) - 96;
                }
            }
            coincidencias = "";
        }

        System.out.println(sum);

    }
}
