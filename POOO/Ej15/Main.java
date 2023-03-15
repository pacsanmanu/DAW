package Ej15;

import Ej15.Clases.Lavadora;

public class Main {
    public static void main(String[] args) {
        Lavadora toshiba = new Lavadora("Toshiba", 499.95, 300, false);
        System.out.println(toshiba.getConsumo(10));
        System.out.println(toshiba.getCosteConsumo(10, 3.95));
        System.out.println(toshiba.modoFuncionamiento());
    }
}