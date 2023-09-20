package Clases;

import java.util.ArrayList;

public class Paciente extends Persona{
    private ArrayList<Enfermedad> enfermedades;

    public Paciente(String nombre, int edad, char sexo){
        super(nombre, edad, sexo);
        this.enfermedades = new ArrayList<Enfermedad>();
    }

    public ArrayList<Enfermedad> getEnfermedades() {
        return this.enfermedades;
    }

    public void setEnfermedades(ArrayList<Enfermedad> enfermedades) {
        this.enfermedades = enfermedades;
    }

    public void Enfermar(Enfermedad enfermedad){
        this.enfermedades.add(enfermedad);
        System.out.println("Se ha añadido la enfermedad: " + enfermedad);
    }

    public void Curarse(Enfermedad enfermedad){
        this.enfermedades.remove(enfermedad);
        System.out.println("La persona se ha curado de " + enfermedad);
    }

    public void Saludar(Sanitario persona){
        System.out.println("Hola " + persona.getNombre());
    }

    public void Saludar(Paciente persona){
        System.out.println("Hola " + persona.getNombre());
        for(Enfermedad e : persona.getEnfermedades()){
            if(!this.getEnfermedades().contains(e)){
                e.Contagiar(this);
            }
        }
        System.out.println("");

        System.out.println("Hola " + this.getNombre());
        for(Enfermedad e : this.getEnfermedades()){
            if(!persona.getEnfermedades().contains(e)){
                e.Contagiar(persona);
            }
        }
    }

}
