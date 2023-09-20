package Clases;

public class Sanitario extends Persona{
    private String categoria;

    public Sanitario(String nombre, int edad, char sexo, String categoria){
        super(nombre, edad, sexo);
        this.categoria = categoria;
    }
    
    public String getCategoria() {
        return categoria;
    }
    
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public void Saludar(Persona persona){
        System.out.println("Hola " + persona.getNombre());
    }

    public void Diagnosticar(Paciente persona){
        for(Enfermedad e : persona.getEnfermedades()){
            if(e.isCurable()){
                System.out.println(e + " ---- Es curable.");
            }else{
                System.out.println(e + " ---- No es curable.");
            }
        }
    }

    public void Curar(Paciente persona){
        for(Enfermedad e : persona.getEnfermedades()){
            if(e.isCurable()){
                persona.Curarse(e);
            }else{
                System.out.println("La enfermedad " + e + " no se ha podido curar.");
            }
        }
    }
}
