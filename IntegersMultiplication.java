import java.util.Scanner;

  public class IntegersMultiplication {

     public static void main (String [] args) {

     Scanner input = new Scanner(System.in);

   int num1;
   int num2;


  System.out.print ("Enter an integer: "); 
  num1 = input.nextInt(); 

  System.out.print ("Enter an integer: "); 
  num2 = input.nextInt(); 


  if (num1 * 3 == num2 * 2) 
  System.out.printf("%d num1 tripled is a multiple of num2 doubled", num1,num2);


   if (num1 *3 != num2 * 2)
   System.out.printf("%d num1 tripled is not a multiple of num2 doubled", num1,num2);

  }

}
