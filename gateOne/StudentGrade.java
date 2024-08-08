import java.util.ArrayList; 
import java.util.Scanner;


	public class StudentGrade {
	  public static void main(String [] args) {


	Scanner Scanner = new Scanner(System.in); 
	
	ArrayList<Double> studentOneScores = new ArrayList<Double>(); 
	ArrayList<Double> studentTwoScores = new ArrayList<Double>(); 
	ArrayList<Double> studentThreeScores = new ArrayList<Double>(); 
	ArrayList<Double> studentFourScores = new ArrayList<Double>(); 

	int[] numberOfStudents = new int [4];
	int[] numberOfSubjects = new int [3];


	System.out.println("How many students do you have?: "); 
	numberOfStudents = Scanner.nextInt(); 

	
	System.out.println("How many Subjects do they offer?: "); 
	numberOfSubjects = Scanner.nextInt(); 
	
	System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>"); 
	System.out.println("Saved Succesfully"); 


	// System.out.printf("%s %n %s", "Entering score for student 1:" "Enter score for subject 1" );
 

	System.out.println("Entering score for student 1: ");

	System.out.println("Enter score for subject 1: "); 
	studentOneScores.add(Scanner.nextDouble());

	System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>"); 
	System.out.println("Saved Succesfully"); 

	System.out.println("Entering score for student 1: ");

	System.out.println("Enter score for subject 2: "); 
	studentOneScores.add(Scanner.nextDouble()); 

	System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>"); 
	System.out.println("Saved Succesfully"); 

	System.out.println("Entering score for student 1: ");

	System.out.println("Enter score for subject 3: "); 
	studentOneScores.add(Scanner.nextDouble());

	System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>"); 
	System.out.println("Saved Succesfully"); 


	System.out.println("Entering score for student 2: ");

	System.out.println("Enter score for subject 1: "); 
	studentTwoScores.add(Scanner.nextDouble());

	System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>"); 
	System.out.println("Saved Succesfully"); 


	System.out.println("Entering score for student 2: ");

	System.out.println("Enter score for subject 2: "); 
	studentTwoScores.add(Scanner.nextDouble());

	System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>"); 
	System.out.println("Saved Succesfully"); 


	System.out.println("Entering score for student 2: ");

	System.out.println("Enter score for subject 3: "); 
	studentTwoScores.add(Scanner.nextDouble());

	System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>"); 
	System.out.println("Saved Succesfully"); 


	System.out.println("Entering score for student 3: ");

	System.out.println("Enter score for subject 1: "); 
	studentThreeScores.add(Scanner.nextDouble());

	System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>"); 
	System.out.println("Saved Succesfully"); 


	System.out.println("Entering score for student 3: ");

	System.out.println("Enter score for subject 2: "); 
	studentThreeScores.add(Scanner.nextDouble());

	System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>"); 
	System.out.println("Saved Succesfully"); 


	System.out.println("Entering score for student 3: ");

	System.out.println("Enter score for subject 3: "); 
	studentThreeScores.add(Scanner.nextDouble());

	System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>"); 
	System.out.println("Saved Succesfully"); 

	System.out.println("Entering score for student 4: ");

	System.out.println("Enter score for subject 1: "); 
	studentFourScores.add(Scanner.nextDouble());

	System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>"); 
	System.out.println("Saved Succesfully"); 

	System.out.println("Entering score for student 4: ");

	System.out.println("Enter score for subject 2: "); 
	studentFourScores.add(Scanner.nextDouble());

	System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>"); 
	System.out.println("Saved Succesfully"); 

	System.out.println("Entering score for student 4: ");

	System.out.println("Enter score for subject 3: "); 
	studentFourScores.add(Scanner.nextDouble());


  }

} 







/*


-------------------------------


first refinement: 

1. allows a teacher to enter [scores] for all his [studemts] = should take arbitrary number (can take any number of students and [subjects]) 

2. prompt teacher to enter number of students( use variable = numberOfStudents <array>)

3. prompt teaacher to enter number of subjects ( use variable = numberOfSubjects <array> ) 

// 4. use variable (totalStudentScore) to collect scores(0-100) of every subject for each student ( use new arrays collection - 


second refinement: 


1. Promt teacher to enter how many students he has, ( add to variable; int numberOfStudents)

2. prompt teacher to enter how many subjects they offering ( add to int numberOfSubjects)


// 3. irrespective of number of students and number of subjects ( find a way to make the arraylist collect any amount of students and any amount of subjects) 


4. 


5. prompt teacher to enter score for student 1.. 
- collect subject 1 scores
- collect subject 2 scores
- collect subject 3 scores

( use array <studentOneScores to add scores for student 1) 
	==> println( saving, >>>>>>>>>>>>>>>)
	    print(saved succesfully)
	



6. Prompt teacher to enter score for student 2... 
- collect subject 1 scores
- collect subject 2 scores
- collect subject 3 scores 

( use array <studentTwoScores to add scores for student 2) 
	==> println( saving, >>>>>>>>>>>>>>>)
	    print(saved succesfully)


7. Prompt teacher to enter score for student 3... 
- collect subject 1 scores
- collect subject 2 scores
- collect subject 3 scores 

( use array <studentThreeScores to add scores for student 3) 
	==> println( saving, >>>>>>>>>>>>>>>)
	    print(saved succesfully)
	

8. Prompt teacher to enter score for student 4... 
- collect subject 1 scores
- collect subject 2 scores
- collect subject 3 scores 

( use array <studentFourScores to add scores for student 4) 
	==> println( saving, >>>>>>>>>>>>>>>)
	    print(saved succesfully)

9. printF(format STUDENT ( 5 spaces ) SUB1 (3 spaces) SUB2 (3 Spaces) SUB3 (3 spaces) TOT (space 3) POST 

System.out.printf(%8s %8s %8s %8s%n", "STUDENT", "SUB1", "SUB2" "SUB3" "TOT" "AVERAGE");

10. Printf( student1-4Scores Array. 



--------------------------------------






// Lagbaja schools hired you to create an application to manage student grades in their classrooms. 
write an application that allows a teacer enter scores for all his students, irrespective of number of students and numbers of subjects.

Your app should be able to do the following; 
1. Ask the teacher for the numbr of students.
2. Ask the teacher for the number of subjects.
3. Collect the scores for every students and every subjects
4. constraint: score must be between 0 and 100
5. display class summary after input collection 

6.


-----------------------------

psuedo:

top: Help lagbaja schools create an application that allows its teacher to manage all his students grades and subjects,
 irrespective of number of students and subjects they offer; 










}


}


*/