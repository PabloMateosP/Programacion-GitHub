package Practica3_2;

public class Casa {
    Direccion direccion;
    private Double precio; //Usamos el double para que le valor de la casa pueda almacenar comas.
    private char calificacionEnergetica;
    private String referenciaCatastral;
    private final Integer IVA = 21/100;
    private final Integer IVA_REDUCIDO = 16/100; //Usamos el final ya que se corresponden a valores que no van a ser modificados.
    private Double precioIVAReducido;
    private Double precioIVA;
    void precioIva (){
        setPrecioIVA(getPrecio() * getIVA());
    }
    void precioIvaReducido (){
        setPrecioIVAReducido(getPrecio() * getIVA_REDUCIDO());
    }
    protected void ImprimirTodo (){
        System.out.println("La referencia catastral de la casa es: " + getReferenciaCatastral());
        System.out.println("El precio de la casa es: " + getPrecio());
        System.out.println("El precio de la casa con el IVA añadido es de: "+ getPrecioIVA());
        System.out.println("El precio de la cassa con el IVA reducido añadido es: " + getPrecioIVAReducido());
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public char getCalificacionEnergetica() {
        return calificacionEnergetica;
    }

    public void setCalificacionEnergetica(char calificacionEnergetica) {
        this.calificacionEnergetica = calificacionEnergetica;
    }

    public String getReferenciaCatastral() {
        return referenciaCatastral;
    }

    public void setReferenciaCatastral(String referenciaCatastral) {
        this.referenciaCatastral = referenciaCatastral;
    }

    public Integer getIVA() {
        return IVA;
    }

    public Integer getIVA_REDUCIDO() {
        return IVA_REDUCIDO;
    }

    public Double getPrecioIVAReducido() {
        return precioIVAReducido;
    }

    public void setPrecioIVAReducido(Double precioIVAReducido) {
        this.precioIVAReducido = precioIVAReducido;
    }

    public Double getPrecioIVA() {
        return precioIVA;
    }

    public void setPrecioIVA(Double precioIVA) {
        this.precioIVA = precioIVA;
    }
}
