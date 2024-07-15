 import java.util.Scanner;


  public class CircleWorkings {

   public static void main(String [] args) {

   Scanner input = new Scanner (System.in); 

  int radius; 
  
  System.out.print ("Enter an int for your circle radius: "); 
  radius = input.nextInt(); 

  int circleDiameter = 2 * radius; 
  float circleCircumference = 2 * radius * 22/7; 
  float circleArea = 22/7 * 2;


   System.out.printf("the circle diameter is %.3d%n", circleDiameter);
   System.out.printf("the circle diameter is %.3f%n", circleCircumference);
   System.out.printf("the circle diameter is %.3f%n", circleArea);


  }

}

