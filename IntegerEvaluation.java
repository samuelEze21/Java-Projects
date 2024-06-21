import java.util.Scanner;

  public class IntegerEvaluation {

     public static void main (String [] args) {

     Scanner input = new Scanner(System.in);
   

  System.out.print ("Enter integer: "); 
  int num = input.nextInt(); 
  
  int numSquare = num * num; 


  if (num > 100) 
  System.out.printf("%d is greater than 100%n", num);
 
 if (numSquare > 100) 
  System.out.printf("%d is greater than 100%n", numSquare);


  if (num == 100) 
  System.out.printf("%d is equal to 100%n", num);
 
  if (numSquare == 100) 
  System.out.printf("%d is equal to 100%n", numSquare);


  if (num != 100) 
  System.out.printf("%d is not equal to 100%n", num);
 
 if (numSquare != 100) 
  System.out.printf("%d is not equal to 100%n", numSquare);


 if (num < 100) 
  System.out.printf("%d is less than 100%n", num);
 
 if (numSquare < 100) 
  System.out.printf("%d is less than 100%n", numSquare);

  }

}