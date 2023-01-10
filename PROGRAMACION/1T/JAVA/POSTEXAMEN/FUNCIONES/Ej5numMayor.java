package POSTEXAMEN.FUNCIONES;

public class Ej5numMayor {

    public static int numMayor(int a, int b){
        if(a > b){
            return a;
        }else{
           return b;
        }
    }
    public static void main(String[] args) {
        System.out.println(numMayor(25, 35));
    }
}
