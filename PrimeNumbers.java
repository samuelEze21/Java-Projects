	import java.util.Scanner; 

   public class PrimeNumbers {
     public static void main (String [] args) {
        
    Scanner input = new Scanner(System.in); 

      
      System.out.println("Enter a positive integer");
      int num = input.nextInt(); 


     if (num >= 2 && num <= 3) {
     System.out.println( num + "is a prime number: "); 


     if (num % 2 != 0 && num % 3 != 0) {
     System.out.println( num + "is a prime number: "); 
   }

   } else {
     System.out.println( num + "is not a prime number: "); 
  } 
     
      


  }

}




