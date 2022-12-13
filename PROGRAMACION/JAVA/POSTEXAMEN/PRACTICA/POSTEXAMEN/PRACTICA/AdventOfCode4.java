package POSTEXAMEN.PRACTICA;
import POSTEXAMEN.PRACTICA.Utils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class AdventOfCode4 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
  
        int sum = 0;
        
        String[] strategy = Utils.LeerFichero("C:\\day2.txt");

        for(int i = 0; i < strategy.length; i++){
            if(strategy[i].charAt(2) == 'X'){
                if(strategy[i].charAt(0) == 'A'){
                    sum += 3;
                }else if(strategy[i].charAt(0) == 'B'){
                    sum += 1;
                }else if(strategy[i].charAt(0) == 'C'){
                    sum += 2;
                }
            }else if(strategy[i].charAt(2) == 'Y'){
                if(strategy[i].charAt(0) == 'A'){
                    sum += 4;
                }else if(strategy[i].charAt(0) == 'B'){
                    sum += 5;
                }else if(strategy[i].charAt(0) == 'C'){
                    sum += 6;
                }
            }else if(strategy[i].charAt(2) == 'Z'){
                if(strategy[i].charAt(0) == 'A'){
                    sum += 8;
                }else if(strategy[i].charAt(0) == 'B'){
                    sum += 9;
                }else if(strategy[i].charAt(0) == 'C'){
                    sum += 7;
                }
            }
        }
        System.out.println(sum);
    }
}
