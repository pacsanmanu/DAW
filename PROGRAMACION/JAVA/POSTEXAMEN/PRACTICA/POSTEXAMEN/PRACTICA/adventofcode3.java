package POSTEXAMEN.PRACTICA;
import POSTEXAMEN.PRACTICA.Utils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class adventofcode3 {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        int sum = 0;
        
        String[] strategy = Utils.LeerFichero("C:\\day2.txt");

        for(int i = 0; i < strategy.length; i++){
            if(strategy[i].equals("C Y")){
                sum += 2;
            }else if(strategy[i].equals("B Z")){
                sum += 9;
            }else if(strategy[i].equals("C Z")){
                sum += 6;
            }else if(strategy[i].equals("B Y")){
                sum += 5;
            }else if(strategy[i].equals("A X")){
                sum += 4;
            }else if(strategy[i].equals("A Y")){
                sum += 8;
            }else if(strategy[i].equals("A Z")){
                sum += 3;
            }else if(strategy[i].equals("B X")){
                sum += 1;
            }else if(strategy[i].equals("C X")){
                sum += +7;
            }   
        }

        System.out.println(sum);

    }
}
