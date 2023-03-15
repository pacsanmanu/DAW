package Clases;

public interface Enfermedad {
    public void Contagiar(Paciente persona);
    public int getCodigo();
    public void setCodigo(int codigo);
    public boolean isCurable();
    public void setCurable(boolean cura);
}
