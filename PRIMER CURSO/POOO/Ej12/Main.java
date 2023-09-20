import Clases.*;
public class Main {
    public static void main(String[] args) {
        Superheroe superman = new Superheroe("Superman");
        Superheroe superman2 = new Superheroe("Superman2");
        Superheroe superman3 = new Superheroe("Superman3");
        Superheroe superman4 = new Superheroe("Superman4");
        superman2.setCapa(true);
        superman4.setCapa(true);
        Dimension medida = new Dimension(3, 3, 3);
        Dimension medida2 = new Dimension(3, 3, 3);
        Dimension medida3 = new Dimension(3, 3, 3);
        Dimension medida4 = new Dimension(3, 3, 3);
        Figura pollon = new Figura("0123BA", 29.95, superman, medida);
        Figura pollon2 = new Figura("0123BB", 28.95, superman2, medida2);
        Figura pollon3 = new Figura("0123BC", 22.95, superman3, medida3);
        Figura pollon4 = new Figura("0123BD", 39.95, superman4, medida4);
        superman4.setDescripcion("El auténtico bicho, depredador de tiesos");
        Coleccion Figuras = new Coleccion("Mi Coleccion");
        Figuras.añadirFigura(pollon);
        Figuras.añadirFigura(pollon2);
        Figuras.añadirFigura(pollon3);
        Figuras.añadirFigura(pollon4);
        System.out.println(Figuras.getValorColeccion());
        System.out.println(Figuras.masValioso());
    }
}