public class Practica2 {
    public static void main(String[] args) {
        int max = 100; 
        int randomNumber = (int)Math.floor(Math.random()*max); 
        if (randomNumber <= 1)
            System.out.println("El número " + randomNumber + " no es primo " );
        else if (randomNumber == 2)
            System.out.println("El número " + randomNumber + " es un número primo ");
        else {
            for (int i=2; 2<randomNumber; i++){
               if (randomNumber % i == 0 )
                   System.out.println("El número " + randomNumber + " no es un número primo ");
               } 
          System.out.println("El número " + randomNumber + " es un número primo "); 
       }
    }
    
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