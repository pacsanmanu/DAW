package Clases;

public class Coronavirus implements Enfermedad{
    private int codigo;
    private boolean curable;

    public Coronavirus(){
        this.codigo = 2;
        this.curable = false;
    }

    public void Contagiar(Paciente persona){
        System.out.println("La persona se ha contagiado del virus inevitable COVID");
        persona.Enfermar(this);
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
        return "Coronavirus [codigo=" + codigo + "]";
    }
}
