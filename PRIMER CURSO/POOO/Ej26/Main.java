package Ej26;
import java.util.HashMap;
import java.util.Scanner;

import javax.print.attribute.IntegerSyntax;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime números: ");
        String aux = sc.nextLine();
        String[] numerosString = aux.split(" ");
        Integer[] numeros = new Integer[numerosString.length];

        for(int i = 0; i < numeros.length; i++){
            numeros[i] = Integer.parseInt(numerosString[i]);
        }

        HashMap<Integer, Integer> contador = new HashMap<>();

        for(int i = 0; i < numeros.length; i++){
            if(contador.containsKey(numeros[i])){
                contador.put(numeros[i], contador.get(numeros[i]) + 1);
            }else{
                contador.put(numeros[i], 1);
            }
        }

        System.out.println(contador);
    }
}