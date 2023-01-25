package Ej2.Clases;

public class Zapato {
    public String modelo;
    public int talla;
    public String color;
    public String material;
    public Boolean cordones;
    public String altura;

    public Zapato (String modelo, int talla, String color, String material, Boolean cordones, String altura){
        this.modelo = modelo;
        this.talla = talla;
        this.color = color;
        this.material = material;
        this.cordones = cordones;
        this.altura = altura;
    }
}