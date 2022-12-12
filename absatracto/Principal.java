package absatracto;

public class Principal {
    public static void main(String[] args) {
        Animal a = new Perro(); //No se puede poner Animal a = new Animal(); ya que no es abstracto.
        Integer numPatas = a.getNumPatas();
        System.out.println("Numero de patas: " + numPatas);
        System.out.println("¿Es mamífero? " + a.esMamifero());
    }
}
