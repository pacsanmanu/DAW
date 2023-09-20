import Clases.*;

public class Main {
    public static void main(String[] args) {
        Adulto paco = new Adulto("Paco", 25, 'H');
        Niño paquito = new Niño("Paquito", 11, 'H');
        Sanitario manolo = new Sanitario("Manolo", 56, 'H', "Enfermero");

        Gripe gripe = new Gripe();
        Resfriado resfriado = new Resfriado();
        Coronavirus coronavirus = new Coronavirus();

        paco.Enfermar(coronavirus);
        paquito.Enfermar(resfriado);
        paco.Saludar(paquito);

        manolo.Diagnosticar(paquito);
        manolo.Curar(paquito);
    }
}
