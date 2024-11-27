package Exercise_4;

import java.util.Scanner;

public class Q8_AdvancedGradingSystem {
	
	/* 8. Advanced Grading System
	 Create a grading system that considers attendance and participation along with the score.
	Use a ladder if-else-if statement to assign grades based on the following criteria:
	Score >= 90 and attendance >= 75%: Grade A
	Score >= 80 and attendance >= 70%: Grade B
	Score >= 70 and attendance >= 65%: Grade C
	Score >= 60 and attendance >= 60%: Grade D
	Otherwise: Grade F
	 *
	 * 
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		

        System.out.print("Enter the student's score: ");
        double score = scanner.nextDouble();
        System.out.print("Enter the student's attendance percentage: ");
        double attendance = scanner.nextDouble();
        String grade;

        if (score >= 90 && attendance >= 75) {
            grade = "A";
        } else if (score >= 80 && attendance >= 70) {
            grade = "B";
        } else if (score >= 70 && attendance >= 65) {
            grade = "C";
        } else if (score >= 60 && attendance >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("The student's grade is: " + grade);

        scanner.close();
		

	}

}
