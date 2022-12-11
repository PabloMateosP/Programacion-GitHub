public class Madre extends Abuela {
    String calle = "El greco";
    String nombre = "Ana";
    String Pueblo = "Prado del Rey";
    Integer Numero = 17;
    Integer numero = 1;
    @Override
    /**
     * En este caso debemos de utilizar el this para que nuestros valores sean los dados en esta clase ya que son diferentes a los de la anterior clase
     */
    void setCalle(String calle) {
        super.setCalle(this.calle);
    }

    @Override
    void setNombre(String nombre) {
        super.setNombre(this.nombre);
    }

    @Override
    void setNumero(Integer Numero) {
        super.setNumero(this.Numero);
    }

    @Override
    void setPueblo(String Pueblo) {
        super.setPueblo(Pueblo);
    }

    void Imprimir_nombre(String nombre) {
        super.Imprimir_nombre(this.nombre);
    }
    void Direccion(String calle, Integer Numero, String Pueblo) {
        super.Direccion(this.calle, this.Numero, this.Pueblo);
    }

    @Override
    void Numero_Hijos(Integer numero) {
        super.Numero_Hijos(this.numero);
    }
}
