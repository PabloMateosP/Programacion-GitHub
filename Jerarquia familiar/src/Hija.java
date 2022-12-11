public class Hija extends Madre {
    String calle = "El greco";
    String nombre = "Lucía";
    String Pueblo = "Prado del Rey";
    Integer Numero = 17;
    @Override
    /**
     * En los setters posteriores daria igual poner el this ya que tanto la madre como la hija poseen los mismos datos menos el  nombre.
     */
    void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    @Override
    void setNumero(Integer Numero) {
        super.setNumero(Numero);
    }

    @Override
    void setCalle(String calle) {
        super.setCalle(calle);
    }

    @Override
    void setPueblo(String Pueblo) {
        super.setPueblo(Pueblo);
    }

    @Override
    void Direccion(String calle, Integer Numero, String Pueblo) {
        this.Direccion(calle, Numero, Pueblo);
        /**
         * En este caso daría igual utilizar super o this ya que tanto la madre como la hija poseen la misma direccion.
         */
    }

    @Override
    void Imprimir_nombre(String nombre) {
        this.Imprimir_nombre(nombre);
    }
}
