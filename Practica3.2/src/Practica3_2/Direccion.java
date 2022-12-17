package Practica3_2;

public class Direccion {
    String calle;
    Integer numero;
    String piso;
    Integer codigoPostal;
    String localidad;
    String provincia;

    void ImprimirDireccion(String calle,Integer numero,String piso,Integer codigoPostal,String localidad,String provincia){
        this.calle = calle;
        this.numero = numero;
        this.codigoPostal = codigoPostal;
        this.piso = piso;
        this.localidad = localidad;
        this.provincia = provincia;
        System.out.println(calle + ", " + numero  + ", " + codigoPostal + ", " + piso + ", " + localidad + ", " + provincia );
    }
}
