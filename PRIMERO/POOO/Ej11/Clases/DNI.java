package Ej11.Clases;

public class DNI {
    private int numero;
    private String letra;

    public DNI(){
        this.numero = 0;
        this.letra = " ";
    }

    public DNI(int numero){
        String[] letras = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        this.numero = numero;
        this.letra = letras[numero % 23];
    }

    @Override
    public String toString(){
        return this.numero + " " + this.letra;
    }
}
