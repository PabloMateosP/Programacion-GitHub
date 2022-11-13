public class Practica2 {
    /**
     * - los comentarios iran precedidos por un guion los que no van precedidos por este son pruebas del código para su funcionamiento.
     * - Código para obtener si un número random es primo o no.
     * - Para que un número sea primo este solo se podra dividir entre 1 y el mismo numero
     * @author Pablo Mateos Palas  
     */ 
    public static void main(String[] args) {
        // - Como primer paso comenzamos definiendo un número máximo hasta el cual nuestro codigo funcionara en nuestro caso es el 100. En el paso siguiente creamos nuestra variable randomNumber siendo este un número random proporcionado por el comando math.
        int max = 100; 
        int randomNumber = (int)Math.floor(Math.random()*max);
        // - A partir de aqui comenzamos haciendo que cuando el número random que nos aparezca sea 1 nuestro código nos devuelva que no es primo, y por otras lado haciendo que si nuestro numero es 2 o 3 nos devuelva que si es número primo  
        if (randomNumber <= 1)
            System.out.println("El número " + randomNumber + " no es primo " );
        else if (randomNumber == 2)
            System.out.println("El número " + randomNumber + " es un número primo ");
        else if (randomNumber == 3)
            System.out.println("El número " + randomNumber + " es un número primo ");
        // - En este paso creamos un else como opción final en la que declararemos 5 variables
        else {
            //for (int i=2; i < randomNumber; i++){
            int i = 1;
            int y = 2;
            int z = 3;
            int x = 5;
            int w = 7;
            //while (i < randomNumber) {
            //i = i + 1;
            // -  Con nuestras variables comprobaremos si el número aleatorio es divisible entre 2, 3, 5 y 7 y si este número es divisible por lo tanto no sera primo.
            if (randomNumber % i == 0 ) {   
                if (randomNumber % y == 0 || randomNumber % z == 0 || randomNumber % x == 0 || randomNumber % w == 0 )
                    System.out.println("El número " + randomNumber + " no es un número primo ");
                //if (randomNumber % z == 0 )
                //    System.out.println("El número " + randomNumber + " no es un número primo ");
                //if (randomNumber % x == 0 )
                //  System.out.println("El número " + randomNumber + " no es un número primo "); 
                //if (randomNumber % w == 0)
                //    System.out.println("El número " + randomNumber + " no es un número primo "); 
            // - Este siendo el ultimo paso donde aquellos numero que no se han podido dividir entre 2, 3, 5, 7 serán por lo tanto numeros primos.     
            else 
                System.out.println("El número " + randomNumber + " es un número primo ");
            } 
        }
    }
// -  Esta era otra prueba util del codigo mediante booleanos que nos imprime en lista desde el 0 hasta el 100 que números son primos y cuales no 
//    public static boolean primo(int n) {
//        if (n <= 1) 
//            return false;
//        else if (n==2)
//          return true;
//        else {
//           for (int i = 2; i<n; i++){
//                if (n % i == 0)
//                    return false;
//            }
//            return true;
//        }
//    }
//    public static void main(String[] args) {
//        for (int i = 1; i <= 100; i++)
//            System.out.println(i + " es " + primo(i)); 
//    }
}