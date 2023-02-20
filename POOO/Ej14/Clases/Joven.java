package Ej14.Clases;

public class Joven extends Persona{
    protected int añosEstudio;
    protected int energia;
    protected String pelo;

    public Joven(String nombre, int edad, String pelo){
        super(nombre, edad);
        this.pelo = pelo;
    }

    @Override
    public void Saludar(){
        System.out.println("Hola soy el puto virgen de " + this.nombre);
    }

    public void Saludar2(){
        super.Saludar();
    }
}