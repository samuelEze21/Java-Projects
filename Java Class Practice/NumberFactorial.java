import java.util.Scanner;
   
   public class NumberFactorial{
     public static void main(String []args){
        
        Scanner input = new Scanner(System.in);
       	
        System.out.println("Enter the number: ");
        int num = input.nextInt();

        int numfac = 1, fact = 1;

        while(numfac<=num){
            fact = fact * numfac;
            numfac++;
        }

        System.out.println("Factorial of the number: "+fact);  
     }   
}
