package Practica3_2;

public class Main {
    public static void main(String[] args) {
        Alumnos a = new Alumnos("Manuel", "Pérez", "Sargento", 13);
        Direccion aD  = new Direccion();
        Casa aC = new Casa();
        a.repetidor("Si");
        a.calculoNotamedia(4.0d , 3.0d , 5.0d);
        System.out.println(a + "Vive en la casa: " + aC + " En la dirección " + aD);

        Alumnos b =new Alumnos("Pepe", "Mateos","Chacón",14);
        Direccion bD = new Direccion();
        Casa bC = new Casa();
        b.repetidor("no");
        b.calculoNotamedia(8.0d , 5.3d, 7.0d);
        System.out.println(b + "Vive en la casa: " + bC + " En la dirección " + bD);
    }
}