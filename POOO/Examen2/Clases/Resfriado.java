package Clases;

public class Resfriado implements Enfermedad{
    private int codigo;
    private boolean curable;

    public Resfriado(){
        this.codigo = 3;
        this.curable = true;
    }

    public void Contagiar(Paciente persona){
        double random = Math.random();

        if(random > 0.5){
            System.out.println("La persona se ha contagiado.");
            persona.Enfermar(this);
        }else{
            System.out.println("La persona ha tenido suerte y no se ha contagiado.");
        }
    }

    public int getCodigo() {
        return codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public boolean isCurable() {
        return curable;
    }
    
    public void setCurable(boolean curable) {
        this.curable = curable;
    }

    @Override
    public String toString() {
        return "Resfriado [codigo=" + codigo + "]";
    }
}
