package Clases;

public class Gripe implements Enfermedad{
    private int codigo;
    private boolean curable;

    public Gripe(){
        this.codigo = 1;
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

    public boolean isCurable() {
        return curable;
    }

    public void setCurable(boolean curable) {
        this.curable = curable;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public int getCodigo(){
        return this.codigo;
    }

    @Override
    public String toString() {
        return "Gripe [codigo=" + codigo + "]";
    }
}
