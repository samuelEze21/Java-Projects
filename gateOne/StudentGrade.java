import java.util.ArrayList; 
import java.util.Scanner;


	public class StudentGrade {
	  public static void main(String [] args) {


	Scanner Scanner = new Scanner(System.in); 


	int numberOfStudents = 0; 
	int numberOfSubjects = 0; 


	System.out.println("How many students do you have?: "); 
	numberOfStudents = Scanner.nextInt(); 

	
	System.out.println("How many Subjects do they offer?: "); 
	numberOfSubjects = Scanner.nextInt(); 
	
	System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>"); 
	System.out.println("Saved Succesfully");



        // Create array to store scores for each student
        double[][] allStudentScores = new double[numberOfStudents][numberOfSubjects];

	// Array to store total scores
        double[] totalScores = new double[numberOfStudents]; 




        // Collect scores for each student
        for (int index = 0; index < numberOfStudents; index++) {
            System.out.println("Entering scores for student " + (index + 1) + ": ");
            
            for (int count = 0; count < numberOfSubjects; count++) {
                System.out.println("Enter score for subject " + (count + 1) + ": ");
                allStudentScores[index][count] = Scanner.nextDouble();
            }


            // Calculate total score for the current student
            double totalScore = 0;

            for (int count = 0; count < numberOfSubjects; count++) {
                totalScore += allStudentScores[index][count];
            }

	// Store total score in the array
            totalScores[index] = totalScore; 
            System.out.println("Saved Successfully");
        }

		       
	double[] averageScores = new double[numberOfStudents];

        for (int index = 0; index < numberOfStudents; index++) {
            averageScores[index] = totalScores[index] / numberOfSubjects;
        }


	Integer[] positions = new Integer[numberOfStudents];

	for (int index = 0; index < numberOfStudents; index++) {
		positions[index] = index + 1; 

	}

 	for (int index = 0; index < numberOfStudents; index++) {
		double totalScore = totalScores[index];
		double averageScore = averageScores[index];
		int position = index + 1; 

		System.out.println("==========================================================");
		System.out.println("  STUDENT    SUB1   SUB2   SUB3    TOT     AVE    POS");
		System.out.println("==========================================================");		
		System.out.println("Student " + (index + 1) + ": Total Score = " + totalScore + ", Average = " + averageScore + ", Position = " + position);
        }
	





   }

  }





/*


-------------------------------

psuedo:

top: Help lagbaja schools create an application that allows its teacher to manage all his students grades and subjects,
 irrespective of number of students and subjects they offer; 



first refinement: 

1. allows a teacher to enter [scores] for all his [studemts] = should take arbitrary number (can take any number of students and [subjects]) 

2. prompt teacher to enter number of students( use variable = int numberOfStudents)

3. prompt teaacher to enter number of subjects ( use variable = int numberOfSubjects) 

------------------

second refinement: 

1. Promt teacher to enter how many students he has, ( add to variable; int numberOfStudents)

2. prompt teacher to enter how many subjects they offering ( add to int numberOfSubjects)


3. irrespective of number of students and number of subjects ( find a way to make the arraylist or just use a multidimentional array to store any amount of student and their scores)  



// since, we want to collect arbitry number of students.. no need to prompt user manual for 4 students inputs 


4. use 2 for loop to iterate over number of students and number of subjects, then prompt teacher to enter scores for any numbere of student inside the for loops



5. Then use varaible double total score to collect total score for current student, iterate for all students with forloop. then proceed to save them in the totalscores array to collect and store total scores for all students



6. calculate avarage score for each student = totalscores / numberofsubjects



7. sort the total score for each studnt to realize their positions


8. printf a table displaying the students, scores, average, total, position

9. 

10.

----------------------------------------



//
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

//

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


*/