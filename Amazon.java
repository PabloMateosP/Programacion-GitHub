public class Amazon {
    public static void main(String[] args) {
        Cliente usuario1 = new Cliente();
        Cliente usuario2 = new Cliente();
        Cliente usuario3 = new Cliente();
        Cliente usuario4 = new Cliente();


        System.out.println("Usuario1");
        usuario1.setNombre("Francisco");
        System.out.println("Nombre: " + usuario1.getNombre());
        usuario1.setEdad(21);
        System.out.println("Edad: " + usuario1.getEdad());
        usuario1.setEmail("Francisco123@gmail.com");
        System.out.println("Email: " + usuario1.getEmail());

        System.out.println("Usuario2");
        usuario2.setNombre("Manolo");
        System.out.println("Nombre: " + usuario2.getNombre());
        usuario2.setEdad(31);
        System.out.println("Edad: " + usuario2.getEdad());
        usuario2.setEmail("Manolo123@gmail.com");
        System.out.println("Email: " + usuario2.getEmail());

        System.out.println("Usuario3");
        usuario3.setNombre("Benito");
        System.out.println("Nombre: " + usuario3.getNombre());
        usuario3.setEdad(14);
        System.out.println("Edad: " + usuario3.getEdad());
        usuario3.setEmail("Benito123@gmail.com");
        System.out.println("Email: " + usuario3.getEmail());

        System.out.println("Usuario4");
        usuario4.setNombre("Paco");
        System.out.println("Nombre: " + usuario4.getNombre());
        usuario4.setEdad(45);
        System.out.println("Edad: " + usuario4.getEdad());
        usuario4.setEmail("Pacooomp@gmail.com");
        System.out.println("Email: " + usuario4.getEmail());
        //He hecho lo posible ya que no sé que más hacer :)ç
        //Además se le puede añadir el carrito y los productos.
    }
}
