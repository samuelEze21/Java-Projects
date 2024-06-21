import java.util.Scanner;

  public class IntegerCalculation {

     public static void main (String [] args) {

     Scanner input = new Scanner(System.in);

    System.out.print ("Enter first integer: "); 
    int firstNum = input.nextInt(); 

    System.out.print ("Enter second integer: "); 
    int secondNum = input.nextInt(); 


   int firstNumSquare = firstNum * firstNum; 
   int secondNumSquare = secondNum *secondNum; 

   int sumOfSquares = firstNumSquare + secondNumSquare; 

   int differenceOfSquares = firstNumSquare - secondNumSquare;

  
  System.out.printf("The Square of firstNum is: %d%n", firstNumSquare); 
  System.out.printf("The Square of secondNum is: %d%n ", secondNumSquare); 
  System.out.printf("The sum of their squares is: %d%n", sumOfSquares); 
  System.out.printf("The difference of their squares is: %d%n", differenceOfSquares); 

   

   }

}