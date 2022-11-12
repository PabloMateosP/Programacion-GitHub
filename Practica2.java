public class Practica2 {
    public static void main(String[] args) {
        int max = 100;
        int[] randomNumber = {(int)Math.floor(Math.random()*max)};
        int[] primo = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89 ,97};
        
        if (randomNumber == primo)
            System.out.println("El número " + randomNumber + " no es un número primo ");
            
        else 
            System.out.println("El número " + randomNumber + " es un número primo ");  
    }
}
