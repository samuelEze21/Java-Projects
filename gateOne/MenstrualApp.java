import java.util.Scanner; 
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class MenstrualApp {

  public static void main(String [] args) {


	Scanner scanner = new Scanner(System.in); 

	// import the date time formatter to get the localDate and dateTime formatter 
	DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE; 
	System.out.println("CHECK YOUR MENSTRUAL CIRCLE:");

	System.out.println("Enter the first day of your period (YYYY-MM-DD):"); 
	String firstDayPeriod = scanner.next();

	LocalDate lastPeriodDate = LocalDate.parse(firstDayPeriod, formatter);

	System.out.println("How long is your length of flow(flow duration) (enter in days): "); 
	int flowDuration = scanner.nextInt(); 

	System.out.println("How long is your period cycle(enter in days) "); 
	int periodCycle = scanner.nextInt(); 


	LocalDate nextPeriodDate = lastPeriodDate.plusDays(periodCycle);

	LocalDate ovulationDate = nextPeriodDate.minusDays(14);

	LocalDate bleedingEndDate = lastPeriodDate.plusDays(flowDuration -1);

        LocalDate firstSafePeriodStart = bleedingEndDate.plusDays(1);
        LocalDate firstSafePeriodEnd = ovulationDate.minusDays(5);

        LocalDate secondSafePeriodStart = ovulationDate.plusDays(3);
        LocalDate secondSafePeriodEnd = nextPeriodDate.minusDays(1);

        LocalDate fertilePeriodStart = ovulationDate.minusDays(5);
        LocalDate fertilePeriodEnd = ovulationDate.plusDays(1);

	System.out.println("======================================================================");
        System.out.println("Your next period is expected on: " + nextPeriodDate.format(formatter));
        System.out.println("Your ovulation date is: " + ovulationDate.format(formatter));
        System.out.println("Your bleeding end date is from: "  + bleedingEndDate.format(formatter));
        System.out.println("Your first safe period is from: " + firstSafePeriodStart.format(formatter) + " to " + firstSafePeriodEnd.format(formatter));
        System.out.println("Your fertile period is from: " + fertilePeriodStart.format(formatter) + " to " + fertilePeriodEnd.format(formatter));
        System.out.println("Your second safe period is from: " + secondSafePeriodStart.format(formatter) + " to " + secondSafePeriodEnd.format(formatter));


    }
}






/*

psudo:

1. Display the message "CHECK YOUR MENSTRUAL CYCLE".

2. Prompt the user to enter the first day of their period 

3. prompt user to enter their menstrual circle

4. prompt user for the flow duration



5. calculate next period date

6. Calculate ovulation date

7. calculate bleeding date

8. calculate safe periods 

9. fertile period

10. import the Datetime formatter class and format the inputs and outputs that deals with dates 


*/