import java.util.Scanner;

public class SumEvenOddTenScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sumEven = 0;  
        int sumOdd = 0;   
        
        System.out.println("Enter 10 integers (type 0 to end):");
        
        while (true) {
            int number = scanner.nextInt();
            
            if (number == 0) {
                break; 
            }
            
            if (number % 2 == 0) {
                sumEven += number; 
            } else {
                sumOdd += number;             }
        }
        
        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Sum of odd numbers: " + sumOdd);
        
        scanner.close();
    }
}














