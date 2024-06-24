import java.util.ArrayList;
import java.util.Scanner;

public class InfiniteNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        
        System.out.println("Enter all the numbers you want (type 'done' to finish):");
        
        while (true) {
            System.out.print("Enter a number (or 'done' to finish): ");
            String userInput = input.nextLine();
            
            if (userInput.equalsIgnoreCase("done")) {
                break;
            }
            
            try {
                int num = Integer.parseInt(userInput);
                numbers.add(num);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer or 'done' to finish.");
            }
        }

        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (int num : numbers) {
            if (num > 0) {
                positive++;
            } else if (num < 0) {
                negative++;
            } else {
                zero++;
            }
        }

        System.out.println("Positive numbers: " + positive);
        System.out.println("Negative numbers: " + negative);
        System.out.println("Zeroes: " + zero);
        
        input.close();
    }
}
