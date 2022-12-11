public class Abuela {
    protected String nombre = "Maria";
    protected String calle = "Zurbarán";
    protected Integer Numero = 17;
    protected String Pueblo = "Prado del Rey";
    protected Integer numero = 3;
    String getNombre (){
        return nombre;
    }
    void setNombre (String nombre){
        this.nombre = nombre;
    }
    String getCalle (){
        return calle;
    }
    void setCalle (String calle){
        this.calle = calle;
    }
    String getPueblo (){
        return Pueblo;
    }
    void setPueblo (String Pueblo){
        this.Pueblo = Pueblo;
    }
    Integer getNumero (){
        return Numero;
    }
    void setNumero (Integer Numero){
        this.Numero = Numero;
    }
    void Imprimir_nombre (String nombre){
        System.out.println("Me llamo " + nombre);
    }
    void Direccion (String calle, Integer Numero, String Pueblo ){
        System.out.println("Vivo en " + Pueblo + " en la calle " + calle + " en el numero " + Numero);
    }
    void Numero_Hijos (Integer numero) {
        System.out.println("Tengo " + numero + " hij@s. ");
    }
}
