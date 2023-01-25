package Ej8.Clases;

public class Monitor {
    private String nombre;
    private int[] resolucion;
    private boolean encendido;
    private boolean[][] pixeles;

    public Monitor(String nombre, int resolucionH, int resolucionV){
        this.nombre = nombre;
        this.resolucion = new int[2];
        resolucion[0] = resolucionH;
        resolucion[1] = resolucionV;
        this.encendido = false;
        this.pixeles = new boolean[resolucionH][resolucionV];
    }
    
    public Monitor(String nombre, int[] resolucion){
        this(nombre, resolucion[0], resolucion[1]);
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public int[] getResolucion(){
        return this.resolucion;
    }

    public void setResolucion(int resolucionH, int resolucionV){
        this.resolucion[0] = resolucionH;
        this.resolucion[1] = resolucionV;
        this.pixeles = new boolean[resolucionH][resolucionV];
    }

    public boolean isEncendido(){
        return this.encendido;
    }

    public void encender(){
        this.encendido = true;
    }

    public void apagar(){
        this.encendido = false;
    }

    @Override
    public String toString(){
        return "[" + this.nombre + " , " + this.encendido + " , " + this.pixeles.length + " , " + this.pixeles[1].length + "]";
    }
    
    // private String modelo;
    // private String marca;
    // private String tipoPanel;
    // private float tamaño;
    // private int tasaRefresco;
    // private String resolucion;
    // private String color;
    // private String conectividad;
    // private boolean encendido;
    // private float tiempoRespuesta;

    // public Monitor(String modelo, String marca, String tipoPanel, float tamaño, int tasaRefresco, String resolucion, String color, String conectividad, boolean encendido, float tiempoRespuesta){
    //     this.modelo = modelo;
    //     this.marca = marca;
    //     this.tipoPanel = tipoPanel;
    //     this.tamaño = tamaño;
    //     this.tasaRefresco = tasaRefresco;
    //     this.resolucion = resolucion;
    //     this.color = color;
    //     this.conectividad = conectividad;
    //     this.encendido = encendido;
    //     this.tiempoRespuesta = tiempoRespuesta;
    // }

    // public String getModelo() {
    //     return this.modelo;
    // }

    // public void setModelo(String modelo) {
    //     this.modelo = modelo;
    // }

    // public String getMarca() {
    //     return this.marca;
    // }

    // public void setMarca(String marca) {
    //     this.marca = marca;
    // }

    // public String getTipoPanel() {
    //     return this.tipoPanel;
    // }

    // public void setTipoPanel(String tipoPanel) {
    //     this.tipoPanel = tipoPanel;
    // }

    // public float getTamaño() {
    //     return this.tamaño;
    // }

    // public void setTamaño(float tamaño) {
    //     this.tamaño = tamaño;
    // }

    // public int getTasaRefresco() {
    //     return this.tasaRefresco;
    // }

    // public void setTasaRefresco(int tasaRefresco) {
    //     this.tasaRefresco = tasaRefresco;
    // }

    // public String getResolucion() {
    //     return this.resolucion;
    // }

    // public void setResolucion(String resolucion) {
    //     this.resolucion = resolucion;
    // }

    // public String getColor() {
    //     return this.color;
    // }

    // public void setColor(String color) {
    //     this.color = color;
    // }

    // public String getConectividad() {
    //     return this.conectividad;
    // }

    // public void setConectividad(String conectividad) {
    //     this.conectividad = conectividad;
    // }

    // public boolean isEncendido() {
    //     return this.encendido;
    // }

    // public void setEncendido(boolean encendido) {
    //     this.encendido = encendido;
    // }

    // public float getTiempoRespuesta() {
    //     return this.tiempoRespuesta;
    // }

    // public void setTiempoRespuesta(float tiempoRespuesta) {
    //     this.tiempoRespuesta = tiempoRespuesta;
    // }

}
