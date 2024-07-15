import java.util.Scanner;

public class LargestAndSmallestInfiniteNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        String userResponse;


        do {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (number > largest) {
                largest = number;
            }
            if (number < smallest) {
                smallest = number;
            }

            System.out.print("Do you want to enter another number? (yes/no): ");
            userResponse = scanner.next();

        } while (userResponse.equalsIgnoreCase("yes"));


        System.out.println("The largest number entered is: " + largest);
        System.out.println("The smallest number entered is: " + smallest);

        scanner.close();
    }
}
