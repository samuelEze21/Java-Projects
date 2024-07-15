import java.util.Scanner; 

	public class MinimumAndLargestNumber {
	   public static void main (String [] args) {

	Scanner input = new Scanner(System.in); 


	int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
	int number = 0; 
        String userResponse; 


	for (int counter = 1; counter <=10; counter++) {
	System.out.print("Enter 10 numbers: "); 
	number = input.nextInt();

	if (number > largest) {
                largest = number;
            }

	if (number < smallest) {
                smallest = number;
            }

	} 


        System.out.println("The largest number entered is: " + largest);
        System.out.println("The smallest number entered is: " + smallest);


   }

}


