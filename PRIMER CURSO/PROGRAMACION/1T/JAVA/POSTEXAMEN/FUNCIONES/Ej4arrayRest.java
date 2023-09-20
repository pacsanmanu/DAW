package POSTEXAMEN.FUNCIONES;

public class Ej4arrayRest {
    
    public static int suma(int a, int b){
        return a + b;
    }
    public static void mostrar(int n){
        System.out.println(n);
    }
    public static void mostrar(String ...text){
        for(int i = 0; i < text.length; i++){
            System.out.print(text[i] + " ");
        }
    }
    public static int sumaArray(int... array){
        int suma = 0;
        for(int i = 0; i < array.length; i++){
            suma += array[i];
        }
        return suma;
    }

    public static void main(String[] args) {
        mostrar(suma(1,2));
        mostrar(sumaArray(5,6,7,21,1,2,3,3,1,2,4,56,6));
        mostrar("hola","mundo");
    }
}
