package POSTEXAMEN.FUNCIONES;

public class Ej3 {
    public static int sumaArray(int[] array){
        int suma = 0;
        for(int i = 0; i < array.length; i++){
            suma += array[i];
        }
        return suma;
    }
    public static void main(String[] args) {
        int[] array = {1,3,4,5,7,8,9,12,31};
        int suma = sumaArray(array);
        System.out.println(suma);
    }
}