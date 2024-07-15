   import java.util.Scanner;

   public class WorldPopulationCalculator  {

    public static void main(String [] args) {

    Scanner input = new Scanner(System.in); 

        long population;
        double growthRate;

        System.out.print("Enter current world population: ");
        population = input.nextLong();

        System.out.print("Enter annual world population growth rate: ");
        growthRate = input.nextDouble();


        for(int i=1; i<6; i++, population *= growthRate){
            System.out.printf("%d years = %d\n", i, population);
        }

    }
}

