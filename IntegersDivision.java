 import java.util.Scanner;

  public class IntegersDivision {

     public static void main (String [] args) {

     Scanner input = new Scanner(System.in);

     int num; 

     System.out.print ("Enter an integer: "); 
     num = input.nextInt(); 

     if (num % 3 == 0) 
     System.out.printf("%d is divisible by 3", num);


     if (num % 3 != 0)
     System.out.printf("%d is not divisible by 3", num);

   }

}