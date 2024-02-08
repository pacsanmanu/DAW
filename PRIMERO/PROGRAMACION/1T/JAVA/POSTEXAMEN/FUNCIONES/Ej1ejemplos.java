package POSTEXAMEN.FUNCIONES;

public class Ej1ejemplos {
    
    public static int suma(int a, int b){
        return a + b;   
    }

    public static int resta(int a, int b){
        return a - b;   
    }

    public static int multiplicacion(int a, int b){
        return a * b;   
    }

    public static int division(int a, int b){
        return a / b;   
    }

    public static int modulo(int a, int b){
        return a % b;   
    }

    public static void mostrar(int n){
        System.out.println(n);
    }

    public static void imprimeN(int n){
        for(int i = 0; i < n; i++){
            mostrar(i);
        }
    }
    
}
