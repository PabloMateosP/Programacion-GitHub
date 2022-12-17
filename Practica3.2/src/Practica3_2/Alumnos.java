package Practica3_2;

import Clase_Persona.Persona;

public class Alumnos extends Persona {
    Direccion direccion; //Establecemos que cada alumno tenga su propia dirección según los parámetros que introduzamos.
    String nombre;
    Integer edad;
    String primerApellido;
    String segundoApellido;
    Double notaMedia;
    String repetidor; //Aquí el valor guardado deberá ser un sí o un no.
    public Alumnos(String nombre, String primerApellido, String segundoApellido, Integer edad){
        super();
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido= segundoApellido;
        this.edad = edad;
    }

    public void repetidor(String repetidor) {
        this.repetidor = repetidor;
    }
    public void calculoNotamedia(Double examen1, Double examen2, Double examen3){
        notaMedia = (examen1 + examen2 + examen3)/3;
        System.out.println("La nota media de este alumno es; " + notaMedia);
    }
}
